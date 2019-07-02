package com.example.rabbitmq.topics;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicsReceiver {

    @RabbitListener(queues = "topica")
    public void topicreceive1(String in) {
        System.out.printf(" [topic_A] Received '%s'%n",in);
    }

    @RabbitListener(queues = "topicb")
    public void topicreceive2(String in) {
        System.out.printf(" [topic_B] Received '%s'%n",in);
    }
}