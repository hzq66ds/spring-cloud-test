package com.example.rabbitmq.workqueues;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Tut1Receiver {

    @RabbitListener(queues = "hello")
    public void receive1(String in) {
        System.out.printf(" [x] Received '%s'%n",in);
    }

    @RabbitListener(queues = "hello")
    public void receive2(String in) {
        System.out.printf(" [Y] Received '%s'%n",in);
    }
}