package com.btrace;

import java.util.Random;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/11/24.
 */
public class BTraceTest {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // 计数器
        Counter counter = new Counter();
        while (true) {
            // 每次增加随机值
            System.out.println(counter.add(random.nextInt(10)));
            Thread.sleep(1000);
        }
    }
}
