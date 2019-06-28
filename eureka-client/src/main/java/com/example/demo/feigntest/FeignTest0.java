package com.example.demo.feigntest;

import com.example.demo.test.entities.SpringBootTest;
import com.test.FeginConfiguration1;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by hanzhiqiang on 2018/1/28.
 */
@FeignClient(name="eurekaclient0",configuration = FeginConfiguration1.class)
public interface FeignTest0 {

//    @RequestMapping(value = "/hello")
//    public String sayHello1();
//
//    @RequestMapping(value = "/demo/home/entity0")
//    public SpringBootTest getentity();




    @RequestLine("GET /hello")
    public String sayHello1();

    @RequestLine("POST /demo/home/entity0")
    public SpringBootTest getentity();


}
