package com.example.rabbitmq.publish_subscribe;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Tut001Receiver {

    @RabbitListener(queues = "word")
    public void receive(String in) {
        System.out.printf(" [word] Received '%s'%n",in);
    }
}