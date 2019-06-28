package com.test.springboot.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springboot.demo.entities.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hanzhiqiang on 2018/1/16.
 */
@RestController
//@RibbonClient(name = "eurekaclient1",configuration = Ribbontest0.class)
public class SpringBootTest01 {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @HystrixCommand(fallbackMethod = "sayHellofallbackMethod")
    @RequestMapping(value = "/hello")
    public String sayHello(){
        String mess ="Hello Word spring boot";
        System.out.println(mess);
        return mess;
    }
    public String sayHellofallbackMethod(){
        String mess ="sayHellofallbackMethod";
        System.out.println(mess);
        return mess;
    }



    @HystrixCommand(fallbackMethod = "req_eureka_client_restTemplatefallbackMethod")
    @RequestMapping("/restTemplate/{name}")
    Entity req_eureka_client_restTemplate(@PathVariable("name") String name) {

        return restTemplate.getForObject("http://eurekaclient1/eurekaclient/home/"+name,Entity.class);
    }

    Entity req_eureka_client_restTemplatefallbackMethod(@PathVariable("name") String name) {
        Entity entity = new Entity();
        entity.setName("entity");
        entity.setAge("1");
        entity.setHign("180");
        entity.setId("0");
        entity.setSex("M");
        entity.setWeight("120");
        return entity;
    }

    @HystrixCommand(fallbackMethod = "req_eureka_client_loadBalancerClientfallbackMethod")
    @RequestMapping("/loadBalancerClient/{name}")
    ServiceInstance req_eureka_client_loadBalancerClient(@PathVariable("name") String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("http://eurekaclient1/eurekaclient/home/"+name);
        System.out.println(serviceInstance.getHost()+"\t"+serviceInstance.getPort());
        return  serviceInstance;

    }

    ServiceInstance req_eureka_client_loadBalancerClientfallbackMethod(@PathVariable("name") String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("http://eurekaclient1/eurekaclient/home/"+name);
        System.out.println(serviceInstance.getHost()+"\t"+serviceInstance.getPort());
        return  serviceInstance;

    }


}
