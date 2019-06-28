package com.test;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hanzhiqiang on 2018/1/28.
 */
@Configuration
public class FeginConfiguration1 {
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
