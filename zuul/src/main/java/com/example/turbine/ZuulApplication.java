package com.example.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

	@Bean
	public PatternServiceRouteMapper serviceRouteMapper(){
		return  new PatternServiceRouteMapper("(?<name>ˆ.+)-(?<version>v.+$)","${version}/${name}");
	}

	@Bean
	public MyZuulFilter getMyZuulFilter(){
		return  new MyZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
