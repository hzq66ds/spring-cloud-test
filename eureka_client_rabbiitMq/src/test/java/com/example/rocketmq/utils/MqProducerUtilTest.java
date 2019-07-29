package com.example.rocketmq.utils;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/7/27.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MqProducerUtilTest {
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @org.junit.Test
    public void syncProducer() {
    }

    @org.junit.Test
    public void asyncProducer() {
    }

    @org.junit.Test
    public void onewayProducer() {

    }

    @org.junit.Test
    public void orderedProducer() {
    }

    @org.junit.Test
    public void getMq_addr() {
    }
}
