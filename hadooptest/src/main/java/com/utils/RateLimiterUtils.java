package com.utils;

import com.controllers.Test001;
import com.google.common.util.concurrent.RateLimiter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * 限流
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/8/24.
 * @author HZQ-PC
 */
@Component
public class RateLimiterUtils {
    Log log = LogFactory.getLog(RateLimiterUtils.class);
    private int rateLimiterNum = 2;
    private RateLimiter rateLimiter;
    public RateLimiterUtils() {
        this.rateLimiter = RateLimiter.create(rateLimiterNum);
    }
    public RateLimiter getRateLimiter() {
        return rateLimiter;
    }
}
