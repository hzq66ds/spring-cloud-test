package com.test.springboot.demo.ribbontest;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.test.springboot.demo.Exclud;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hanzhiqiang on 2018/1/25.
 */
@Exclud
@Configuration
public class Ribbontest0 {
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
