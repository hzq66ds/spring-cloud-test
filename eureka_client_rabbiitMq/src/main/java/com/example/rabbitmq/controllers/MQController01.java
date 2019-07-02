package com.example.rabbitmq.controllers;

//import com.example.rabbitmq.publish_subscribe.FanoutSender;
//import com.example.rabbitmq.routing.DirectSender;

import com.example.rabbitmq.publish_subscribe.FanoutSender;
import com.example.rabbitmq.routing.DirectSender;
import com.example.rabbitmq.rpc.RpcSender;
import com.example.rabbitmq.topics.TopicsSender;
import com.example.rabbitmq.workqueues.Tut1Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MQ01")
public class MQController01 {
    @Autowired
    private Tut1Sender tut1Sender;

    @Autowired
    private FanoutSender fanoutSender;

    @Autowired
    private DirectSender directSender;

    @Autowired
    private TopicsSender topicsSender;

    @Autowired
    private RpcSender rpcSender;

    @RequestMapping("send")
    public String sendMq(String msg){
        tut1Sender.send(msg);
        return msg;
    }

    @RequestMapping("sendfanout")
    public String sendfanoutMq(String msg){
        fanoutSender.sendFanoutExchange(msg);
        return msg;
    }

    @RequestMapping("senddirect")
    public String senddirectMq(String msg,String flag){
        directSender.sendDirectExchange(msg,flag==null?"":flag);
        return msg;
    }

    @RequestMapping("sendtopic")
    public String sendtopicMq(String msg,int flag){
        topicsSender.sendTopicExchange(msg,flag);
        return msg;
    }

    @RequestMapping("sendrpc")
    public String sendrpcMq(String msg){
        rpcSender.sendRpcExchange(msg);
        return msg;
    }
}
