package com.example.rabbitmq.workqueues;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tut1Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    @Qualifier("helloQueue")
    private Queue queue;

    public void send(String message) {
        this.template.convertAndSend(queue.getName(), message);
        System.out.printf(" [send] Sent '%s'%n",message);
    }

}