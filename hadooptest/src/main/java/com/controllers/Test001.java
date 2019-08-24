package com.controllers;

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
    public String get(){
        rateLimiterUtils.getRateLimiter().acquire(1);
        log.info("log111111");
        return "msg";
    }

}
