package com.example.rabbitmq.topics;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TopicsSender {

    private final String[] keys = {"0.abc.def0", "a.abc.def.aa", "a.def.aa"};

    @Autowired
    private RabbitTemplate template;

    @Autowired
    @Qualifier("topic")
    private TopicExchange topicExchange;

    public void sendTopicExchange(String message,int flag) {
        if (flag>2||flag<0){
            flag=0;
        }
        this.template.convertAndSend(topicExchange.getName(),keys[flag], message);
        System.out.printf(" [sendTopicExchange] Sent '%s'  %s %n",message,keys[flag]);
    }

}