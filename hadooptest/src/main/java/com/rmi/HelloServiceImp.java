package com.rmi;

import java.io.Serializable;

public class HelloServiceImp implements HelloService, Serializable {
    @Override
    public String hello() {
        System.out.println("HelloServiceImp hello");
        return "HelloServiceImp hello";
    }

    @Override
    public String test() {
        System.out.println("HelloServiceImp test");
        return "HelloServiceImp test";
    }
}
