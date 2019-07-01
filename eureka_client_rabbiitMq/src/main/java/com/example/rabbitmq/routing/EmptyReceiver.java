package com.example.rabbitmq.routing;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmptyReceiver {

    @RabbitListener(queues = "vv")
    public void receiveother(String in) {
        System.out.printf(" [vv] Received '%s' %n",in);
    }

    @RabbitListener(queues = "aa")
    public void receiveword1(String in) {
        System.out.printf(" [aa] Received '%s'%n",in);
    }

    @RabbitListener(queues = "bb")
    public void receivehello1(String in) {
        System.out.printf(" [bb] Received '%s'%n",in);
    }
}