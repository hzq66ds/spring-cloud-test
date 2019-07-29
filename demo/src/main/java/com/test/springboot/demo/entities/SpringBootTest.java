package com.test.springboot.demo.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * Created by hanzhiqiang on 2018/1/1.
 */
@Repository
//@Scope(value = "singleton")
@ConfigurationProperties(prefix = "db.oracle")
public class SpringBootTest {

    private  String username;

    @Override
    public String toString() {
        return "SpringBootTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", JAVA_HOME='" + JAVA_HOME + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private  String password;



    private  String JAVA_HOME;
    @Value("${name}")
    private  String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJAVA_HOME() {
        return JAVA_HOME;
    }

    public void setJAVA_HOME(String JAVA_HOME) {
        this.JAVA_HOME = JAVA_HOME;
    }
}
