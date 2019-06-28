package com.test.springboot.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springboot.demo.entities.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
//@EnableAutoConfiguration
//@Controller
@SpringBootApplication(scanBasePackages= {"com.test.springboot.demo"})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Exclud.class)})
//@ComponentScan(value = "com.test.springboot.demo",nameGenerator = SimpleNameGenerator.class)
@RequestMapping(value = "/demo")
@EnableEurekaClient
@EnableCircuitBreaker
//@RibbonClient(name = "eurekaclient1",configuration = RibbonTest.class)
public class DemoApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

//	@Bean
//	public IClientConfig config(){
//		return  new DefaultClientConfigImpl();
//	}
	@Autowired
	SpringBootTest springBootTest;

	@HystrixCommand(fallbackMethod = "homefallbackMethod")
	@RequestMapping("/home")
	String home() {
		String mess = "";
		mess=springBootTest.toString();
		return mess;
	}

	String homefallbackMethod() {
		String mess = "homefallbackMethod-------";
		mess+=springBootTest.toString();
		return mess;
	}

	@HystrixCommand(fallbackMethod = "home_EntityfallbackMethod")
	@RequestMapping("/home/entity0")
	SpringBootTest home_Entity() {
		System.out.println(springBootTest.toString());
		return springBootTest;
	}

	SpringBootTest home_EntityfallbackMethod() {
		SpringBootTest springBoot = new SpringBootTest();
		springBoot.setName("springBoot");
		springBoot.setUsername("springBoot");
		springBoot.setPassword("springBoot");
		return springBoot;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}