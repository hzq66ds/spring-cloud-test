package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.applet.Applet;

/**
 * @author HZQ-PC
 */
@SpringBootApplication
@RefreshScope
@RestController
public class HadoopApplication {
	@Value("${profile}")
	private String proFile;

	@RequestMapping("/profile")
	String printProFile(){
		return proFile;
	}

	public static void main(String[] args) {
		SpringApplication.run(HadoopApplication.class, args);
	}

}
