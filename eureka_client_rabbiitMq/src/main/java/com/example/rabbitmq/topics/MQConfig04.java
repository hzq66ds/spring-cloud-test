package com.example.rabbitmq.topics;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig04 {

    @Bean
    public TopicExchange topic() {
        return new TopicExchange("tut.topic");
    }

    @Bean
    public Queue topica() {
        return new Queue("topica");
    }

    @Bean
    public Queue topicb() {
        return new Queue("topicb");
    }

    /**
     * 说明：*匹配单个单词，#匹配任意个单词，中间必须.号分割
     * @param topic
     * @param queue
     * @return
     */
    @Bean
    public Binding bindingtopic1(@Qualifier("topic")TopicExchange topic,@Qualifier("topica")Queue queue){
        return BindingBuilder.bind(queue).to(topic).with("*.abc.*");
    }
    @Bean
    public Binding bindingtopic10(@Qualifier("topic")TopicExchange topic,@Qualifier("topica")Queue queue){
        return BindingBuilder.bind(queue).to(topic).with("*.abc.#");
    }

    @Bean
    public Binding bindingtopic2(@Qualifier("topic")TopicExchange topic,@Qualifier("topicb")Queue queue){
        return BindingBuilder.bind(queue).to(topic).with("*.def.*");
    }
    @Bean
    public Binding bindingtopic20(@Qualifier("topic")TopicExchange topic,@Qualifier("topicb")Queue queue){
        return BindingBuilder.bind(queue).to(topic).with("#.def.*");
    }
}
