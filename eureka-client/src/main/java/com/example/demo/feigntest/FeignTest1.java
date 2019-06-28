package com.example.demo.feigntest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanzhiqiang on 2018/1/28.
 */
@FeignClient(name="XXXX",url = "http://192.168.2.143:8761/")
public interface FeignTest1 {
    @RequestMapping(value = "/eureka/apps/{servicename}")
    public String getentity0(@PathVariable("servicename") String servicename);
}
