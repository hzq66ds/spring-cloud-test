package com.example.rabbitmq.routing;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig03 {
    @Bean
    public Queue otherQueue() {
        return new Queue("other");
    }

    @Bean
    public Queue word1Queue() {
        return new Queue("word1");
    }

    @Bean
    public Queue hello1Queue() {
        return new Queue("hello1");
    }

    @Bean
    public DirectExchange direct(){
        return new DirectExchange("tut.direct");
    }
    @Bean
    public Binding binding1(@Qualifier("direct") DirectExchange direct, @Qualifier("word1Queue") Queue queue) {
        return BindingBuilder.bind(queue).to(direct).with("word");
    }
    @Bean
    public Binding binding2(@Qualifier("direct") DirectExchange direct,@Qualifier("hello1Queue") Queue queue) {
        return BindingBuilder.bind(direct).to(direct).with("hello");
    }

    @Bean
    public Binding binding3(@Qualifier("direct") DirectExchange direct,@Qualifier("otherQueue") Queue queue) {
        return BindingBuilder.bind(direct).to(direct).with("other");
    }
}
