package com.example.rabbitmq.workqueues;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;

@Configuration
public class MQConfig01 {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
