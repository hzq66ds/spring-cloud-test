package com.example.demo;

import com.example.demo.feigntest.FeignTest0;
import com.example.demo.feigntest.FeignTest1;
import com.example.demo.test.entities.SpringBootTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableDiscoveryClient 或者 @EnableEurekaClient
@EnableDiscoveryClient
@RestController
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
//@EnableHystrix
@EnableHystrixDashboard
public class EurekaClientTest {
	@Autowired
	public FeignTest0 feignTest0;

	@Autowired
	public FeignTest1 feignTest1;


	@RequestMapping("/sayhello")
	@HystrixCommand(fallbackMethod = "sayhellofallbackMethod",commandProperties = {@HystrixProperty(name="execution.isolation.strategy",value = "THREAD")})
	String sayhello() {
		return  feignTest0.sayHello1();
	}

	String sayhellofallbackMethod() {
		return  "Hello MMP!!!!!";
	}

	@RequestMapping("/demo/entity")
	@HystrixCommand(fallbackMethod = "getentityfallbackMethod")
	SpringBootTest getentity() {
		return  feignTest0.getentity();
	}
	SpringBootTest getentityfallbackMethod() {
		SpringBootTest entity = new SpringBootTest();
		entity.setName("你妹");
		entity.setUsername("在一个你妹");
		entity.setPassword("密码");

		return  entity;
	}

	@RequestMapping("/demo/{servicename}")
	String getentity0(@PathVariable("servicename") String servicename) {
		return  feignTest1.getentity0(servicename);
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTest.class, args);
	}
}
