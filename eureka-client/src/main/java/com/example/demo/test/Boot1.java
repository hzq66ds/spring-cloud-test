package com.example.demo.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanzhiqiang on 2018/1/20.
 */
@RestController
public class Boot1 {
    @RequestMapping(value = {"/hello/{name}"})
    public String hello(@PathVariable("name") String name){
        System.out.println("hello " + name+"!");
        return "hello " + name+"!";
    }
}
