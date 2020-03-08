package com.demo;

import com.interfacetest.Test;

public class Demo implements Test {
    private String name;
    private String teststr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeststr() {
        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", teststr='" + teststr + '\'' +
                '}';
    }

    @Override
    public String sing(String a, String b) {
        String value =  "Demo{" +
                "name='" + a + '\'' +
                ", teststr='" + b + '\'' +
                '}';
        System.out.println(value);
        return value;
    }
}
