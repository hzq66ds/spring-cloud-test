package com.annotations;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 日志打印
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/8/23.
 * @author HZQ-PC
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLogs {
    String value() default "";
    boolean ignore() default false;
}
