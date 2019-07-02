package com.example.rabbitmq.publish_subscribe;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Tut001Receiver {

    @RabbitListener(queues = "word")
    public void pubreceive1(String in) {
        System.out.printf(" [word_X] Received '%s'%n",in);
    }

    @RabbitListener(queues = "word")
    public void pubreceive2(String in) {
        System.out.printf(" [word_Y] Received '%s'%n",in);
    }
}