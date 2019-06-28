package com.example.rabbitmq.publish_subscribe;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private FanoutExchange fanoutExchange;

    public void sendFanoutExchange(String message) {
        this.template.convertAndSend(fanoutExchange.getName(),"", message);
        System.out.printf(" [fanoutExchange] Sent '%s'%n",message);
    }

}