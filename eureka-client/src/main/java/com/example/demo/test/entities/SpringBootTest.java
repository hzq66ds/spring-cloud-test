package com.example.demo.test.entities;

import org.springframework.stereotype.Repository;

/**
 * Created by hanzhiqiang on 2018/1/1.
 */


@Repository
public class SpringBootTest {

    private  String username;

    private  String password;

    private  String JAVA_HOME;
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
