package com.example.rabbitmq.rpc;

import com.example.rabbitmq.routing.DirectSender;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig05 {
    @Bean
    public Queue rpca() {
        return new Queue("rpca");
    }

    @Bean
    public DirectExchange rpcDirectExchange(){
        return new DirectExchange("tut.direct.rpc");
    }

    @Bean
    public Binding rpcBinding(@Qualifier("rpcDirectExchange")DirectExchange directExchange,@Qualifier("rpca") Queue queue){
        return BindingBuilder.bind(queue).to(directExchange).with("rpc");
    }

}
