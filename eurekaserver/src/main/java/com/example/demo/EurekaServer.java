package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class EurekaServer {


    @RequestMapping("/home/{name}")
    String home(@PathVariable("name") String name) {
        String mess = "hello "+name+" spring boot!";

        return mess;
    }
    @RequestMapping("/home/fail/{name}")
    String failehome(@PathVariable("name") String name) {
        String mess = "hello fail home "+name+" spring boot!";

        return mess;
    }
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
