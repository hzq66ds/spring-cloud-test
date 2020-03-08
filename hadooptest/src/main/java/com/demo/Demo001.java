package com.demo;

import com.interfacetest.Test;

public class Demo001 extends Demo {


    @Override
    public String sing(String a, String b) {
        String value =  "Demo001{" +
                "name='" + a + '\'' +
                ", teststr='" + b + '\'' +
                '}';
        System.out.println(value);
        return value;
    }
}
