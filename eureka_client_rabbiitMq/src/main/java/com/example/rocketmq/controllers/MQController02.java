package com.example.rocketmq.controllers;

//import com.example.rabbitmq.publish_subscribe.FanoutSender;
//import com.example.rabbitmq.routing.DirectSender;

import com.example.rabbitmq.publish_subscribe.FanoutSender;
import com.example.rabbitmq.routing.DirectSender;
import com.example.rabbitmq.rpc.RpcSender;
import com.example.rabbitmq.topics.TopicsSender;
import com.example.rabbitmq.workqueues.Tut1Sender;
import com.example.rocketmq.utils.MqProducerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MQ02")
public class MQController02 {
    @Autowired
    private MqProducerUtil mqProducerUtil;

    @RequestMapping("send")
    public String sendMq(String msg){
        mqProducerUtil.syncProducer("hello");
        return "";
    }
}
