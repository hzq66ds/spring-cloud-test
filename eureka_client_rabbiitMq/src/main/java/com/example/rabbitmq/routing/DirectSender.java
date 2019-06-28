package com.example.rabbitmq.routing;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DirectSender {
    String[] flags = {"word","hello","other"};
    @Autowired
    private RabbitTemplate template;

    @Autowired
    @Qualifier("direct")
    private DirectExchange directExchange;

    @Autowired
    @Qualifier("otherQueue")
    private Queue queue;

    public void sendDirectExchange(String message,String flag) {
        if (!Arrays.asList(flags).contains(flag)){
            flag="other";
        }
//        this.template.convertAndSend(directExchange.getName(),flag, message);
        this.template.convertAndSend(queue.getName(),message);
        System.out.printf("[directExchange_%s] Sent '%s'%n",flag,message);
    }
}
