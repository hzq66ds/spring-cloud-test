package com.example.rocketmq;

import org.apache.rocketmq.client.producer.*;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HZQ-PC
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/7/26.
 */
@ConfigurationProperties(prefix = "rocketmq")
public class MqProducerUtil {
    @Value("${addr}")
    private String mq_addr="hadoopslave4:9876";
    /**
     * 同步发送消息
     */
    public SendResult syncProducer(String groupName,String topic,String tag,String message){
        try {
            //Instantiate with a producer group name.
            DefaultMQProducer producer = new DefaultMQProducer(groupName);
            // Specify name server addresses.
            producer.setCreateTopicKey("AUTO_CREATE_TOPIC_KEY");
//            producer.setVipChannelEnabled(false);
            producer.setNamesrvAddr("hadoopslave4:9876");
            //消息发送失败重试次数
            producer.setRetryTimesWhenSendFailed(5);
            //Launch the instance.
            producer.start();

            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message(topic, tag, message.getBytes(RemotingHelper.DEFAULT_CHARSET));
            //Call send message to deliver message to one of brokers.
            //该消息1秒没发送成功则重试
            SendResult sendResult = producer.send(msg,1000);
            System.out.printf("%s%n", sendResult);

            //Shut down once the producer instance is not longer in use.
            producer.shutdown();
            return sendResult;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 异步发送消息
     */
    public void asyncProducer(String groupName,String topic,String tag,String message){
        try {
            //Instantiate with a producer group name.
            DefaultMQProducer producer = new DefaultMQProducer(groupName);
            // Specify name server addresses.
            producer.setNamesrvAddr(mq_addr);
            //Launch the instance.
            producer.start();

            producer.setRetryTimesWhenSendAsyncFailed(5);
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message(topic, tag, "OrderID188", message.getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.send(msg, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.printf("%-10d OK %s %n", 1, sendResult.getMsgId());
                }
                @Override
                public void onException(Throwable e) {
                    System.out.printf("%-10d Exception %s %n", 1, e);
                    e.printStackTrace();
                }
            },1000);
            //Shut down once the producer instance is not longer in use.
            producer.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 单向模式发送消息
     */
    public void onewayProducer(String groupName,String topic,String tag,String message){
        try {
            //Instantiate with a producer group name.
            DefaultMQProducer producer = new DefaultMQProducer(groupName);
            // Specify name server addresses.
            producer.setNamesrvAddr(mq_addr);
            producer.setRetryTimesWhenSendAsyncFailed(5);
            //Launch the instance.
            producer.start();

            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message(topic, tag, message.getBytes(RemotingHelper.DEFAULT_CHARSET) );
            //Call send message to deliver message to one of brokers.
            producer.sendOneway(msg);

            //Shut down once the producer instance is not longer in use.
            producer.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 发送/接收全局和分区排序的消息
     */
    public void orderedProducer (String groupName,String topic,String tag,String message){
        try {
            //Instantiate with a producer group name.
            MQProducer producer = new DefaultMQProducer(groupName);
            //Launch the instance.
            producer.start();
            String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};


            for (int i = 0; i < 100; i++) {
                int orderId = i % 10;
                //Create a message instance, specifying topic, tag and message body.
                Message msg = new Message(topic, tags[i % tags.length], "KEY" + i,
                        ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult sendResult = producer.send(msg, new MessageQueueSelector() {
                    @Override
                    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                        Integer id = (Integer) arg;
                        int index = id % mqs.size();
                        return mqs.get(index);
                    }
                }, orderId);
                System.out.printf("%s%n", sendResult);
            }

            //server shutdown
            producer.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MqProducerUtil mqProducerUtil = new MqProducerUtil();
        mqProducerUtil.syncProducer("group1","TopicTest","TagA","hello");
        mqProducerUtil.onewayProducer("group2","TopicTest","TagB","hello");
    }
}
