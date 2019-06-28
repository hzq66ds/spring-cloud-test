package com.test.springboot.demo.entities;

/**
 * Created by hanzhiqiang on 2018/1/25.
 */

public class Entity {
    private String name;
    private String id;
    private String sex;
    private String age;
    private String weight;
    private String hign;

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", hign='" + hign + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHign() {
        return hign;
    }

    public void setHign(String hign) {
        this.hign = hign;
    }
}
