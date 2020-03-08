package com.controllers;

import com.annotations.MyLogs;
import com.utils.RateLimiterUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/8/24.
 */
@RestController
public class Test001 {
    Log log = LogFactory.getLog(Test001.class);
    @Autowired
    private RateLimiterUtils rateLimiterUtils;

    @GetMapping("/getmsg")
    @MyLogs(ignore = true,value = "getmsg测试")
    public String get(){
        rateLimiterUtils.getRateLimiter().acquire(1);
        return "msg";
    }
    @GetMapping("/getmsg1")
    @MyLogs(ignore = true,value = "getmsg1_test")
    public String get1(String msg){
        rateLimiterUtils.getRateLimiter().acquire(1);
        return "msg1";
    }
}
