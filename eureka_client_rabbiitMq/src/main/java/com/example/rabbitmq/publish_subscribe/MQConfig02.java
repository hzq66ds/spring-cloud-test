package com.example.rabbitmq.publish_subscribe;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig02 {

    @Bean
    public Queue wordQueue() {
        return new Queue("word");
    }

    @Bean
    public FanoutExchange fanout() {
        return new FanoutExchange("tut.fanout");
    }

    @Bean
    public Binding pubbinding1(FanoutExchange fanout,@Qualifier("wordQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(fanout);
    }

    @Bean
    public Binding pubbinding2(FanoutExchange fanout,@Qualifier("helloQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(fanout);
    }

}
