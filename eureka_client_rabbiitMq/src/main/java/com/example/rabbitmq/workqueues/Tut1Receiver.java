package com.example.rabbitmq.workqueues;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Tut1Receiver {

    @RabbitListener(queues = "hello")
    public void receive(String in) {
        System.out.printf(" [x] Received '%s'%n",in);
    }
}