package com.example.rocketmq.utils;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.*;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author HZQ-PC
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/7/26.
 */
@Component
//@ConfigurationProperties(prefix = "rocketmq")
public class MqConsumerUtil {
    @Value("${rocketmq.addr}")
    private String mq_addr="hadoopslave4:9876";

    @Value("${rocketmq.group}")
    private String group="group1";

    @Value("${rocketmq.topic}")
    private String topic="TopicTest";

    @Value("${rocketmq.tag}")
    private String tag="tagA";

    @PostConstruct
    public String consumerMessage(){
        try {
            // Instantiate with specified consumer group name.
            DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(group);
            // Specify name server addresses.
            consumer.setNamesrvAddr(mq_addr);
            // Subscribe one more more topics to consume.
            consumer.subscribe(topic, "*");
            // Register callback to execute on arrival of messages fetched from brokers.
            consumer.registerMessageListener((List<MessageExt> msgs, ConsumeConcurrentlyContext context) -> {
                        System.out.printf("%s consumerMessage Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
                        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                    }
            );

            //Launch the consumer instance.
            consumer.start();
            System.out.printf("Consumer Started.%n");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    /**
     *  ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET一个新的订阅组第一次启动从队列的最前位置开始消费,后续再启动接着上次消费的进度开始消费
     *  ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET 一个新的订阅组第一次启动从队列的最后位置开始消费,后续再启动接着上次消费的进度开始消费
     *  ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST  @Deprecated
     *  ConsumeFromWhere.CONSUME_FROM_MAX_OFFSET   @Deprecated
     *  ConsumeFromWhere.CONSUME_FROM_MIN_OFFSET  @Deprecated
     *  ConsumeFromWhere.CONSUME_FROM_TIMESTAMP    一个新的订阅组第一次启动从指定时间点开始消费,后续再启动接着上次消费的进度开始消费,
     *                                            时间点设置参见DefaultMQPushConsumer.consumeTimestamp参数
     *
     *
     *  MessageModel.CLUSTERING  集群消费，一个 Consumer Group 中的 Consumer 实例平均分摊消费消息。例如某个 Topic 有 9 条消息，其中一个
     Consumer Group 有 3 个实例（可能是 3 个迕程，戒者 3 台机器），那举每个实例只消费其中的 3 条消息
     *  MessageModel.BROADCASTING  广播
     *
     */
    public void orderedProducer() {
        try {
            DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(group);
            consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
            consumer.setMessageModel(MessageModel.CLUSTERING);
            consumer.subscribe(topic, "TagA || TagC || TagD");
            consumer.registerMessageListener(new MessageListenerOrderly() {
                AtomicLong consumeTimes = new AtomicLong(0);
                @Override
                public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                    context.setAutoCommit(false);
                    System.out.printf(Thread.currentThread().getName() + "_"+consumeTimes+" orderedProducer Receive New Messages: " + msgs + "%n");
                    this.consumeTimes.incrementAndGet();
//                    if ((this.consumeTimes.get() % 2) == 0) {
//                        return ConsumeOrderlyStatus.SUCCESS;
//                    } else if ((this.consumeTimes.get() % 3) == 0) {
//                        return ConsumeOrderlyStatus.ROLLBACK;
//                    } else if ((this.consumeTimes.get() % 4) == 0) {
//                        return ConsumeOrderlyStatus.COMMIT;
//                    } else if ((this.consumeTimes.get() % 5) == 0) {
//                        context.setSuspendCurrentQueueTimeMillis(3000);
//                        return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
//                    }
                    return ConsumeOrderlyStatus.SUCCESS;

                }
            });

            consumer.start();

            System.out.printf("Consumer Started.%n");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MqConsumerUtil mqConsumerUtil = new MqConsumerUtil();
        mqConsumerUtil.consumerMessage();
    }

}
