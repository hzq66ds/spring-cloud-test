package com.example.rabbitmq.routing;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmptyReceiver {

    @RabbitListener(queues = "other")
    public void receiveother(String in) {
        System.out.printf(" [other] Received '%s' %n",in);
    }

    @RabbitListener(queues = "word1")
    public void receiveword1(String in) {
        System.out.printf(" [word1] Received '%s'%n",in);
    }

    @RabbitListener(queues = "hello1")
    public void receivehello1(String in) {
        System.out.printf(" [hello1] Received '%s'%n",in);
    }
}