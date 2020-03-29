package com.test.springboot.demo;

import org.elasticsearch.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@SpringBootApplication(scanBasePackages= {"com.test.springboot.demo"})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION)})
@RequestMapping(value = "/demo")
@EnableEurekaClient
@EnableCircuitBreaker
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}