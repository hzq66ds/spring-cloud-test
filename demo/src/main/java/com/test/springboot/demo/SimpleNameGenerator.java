package com.test.springboot.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * Created by hanzhiqiang on 2018/1/14.
 * 自定义 扫描的Bean名字生成规则，类名的大写
 */
public class SimpleNameGenerator implements BeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println(beanDefinition.getBeanClassName().substring(beanDefinition.getBeanClassName().lastIndexOf(".")).toUpperCase());
        return beanDefinition.getBeanClassName().substring(beanDefinition.getBeanClassName().lastIndexOf(".")+1).toUpperCase();
    }
}
