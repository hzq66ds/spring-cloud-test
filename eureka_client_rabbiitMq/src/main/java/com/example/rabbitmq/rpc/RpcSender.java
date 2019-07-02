package com.example.rabbitmq.rpc;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RpcSender {
    @Autowired
    @Qualifier("rpcDirectExchange")
    private DirectExchange directExchange;
    @Autowired
    private RabbitTemplate template;

    public void sendRpcExchange(String message) {
        Object result = this.template.convertSendAndReceive(directExchange.getName(),"rpc", message);
        System.out.printf(" [sendRpcExchange] Sent:'%s'     result:'%s' %n",message,result);
    }

}