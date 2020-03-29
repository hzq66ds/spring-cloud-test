package com.test.springboot.demo.dto;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private Integer id;
    private String name;
    private List<String> intrestings;
    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setName(String name){
        this.name  =name
        ;
    }
    public String getName(){
        return this.name;
    }
    public void setIntrestings(List<String> intrestings){
        this.intrestings=intrestings;
    }
    public List<String> getIntrestings(){
        return this.intrestings;
    }
}





