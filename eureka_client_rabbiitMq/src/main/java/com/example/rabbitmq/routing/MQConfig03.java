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
        return new Queue("vv");
    }

    @Bean
    public Queue aaQueue() {
        return new Queue("aa");
    }

    @Bean
    public Queue bbQueue() {
        return new Queue("bb");
    }

    @Bean
    public DirectExchange direct(){
        return new DirectExchange("tut.direct");
    }
    @Bean
    public Binding binding1(@Qualifier("direct") DirectExchange direct, @Qualifier("bbQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(direct).with("bb");
    }
    @Bean
    public Binding binding2(@Qualifier("direct") DirectExchange direct,@Qualifier("aaQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(direct).with("aa");
    }

    @Bean
    public Binding binding3(@Qualifier("direct") DirectExchange direct,@Qualifier("otherQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(direct).with("vv");
    }
}
