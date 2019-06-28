package com.example.rabbitmq.workqueues;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Tut2Receiver {

    @RabbitListener(queues = "hello")
    public void receive(String in) {
        System.out.printf(" [Y] Received '%s'%n",in);
    }
}