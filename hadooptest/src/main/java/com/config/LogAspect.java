package com.config;

import com.annotations.MyLogs;
import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@EnableAspectJAutoProxy(exposeProxy = true)
@Aspect
@Component
public class LogAspect {
    Log log = LogFactory.getLog(LogAspect.class);

    @Pointcut("@annotation(com.annotations.MyLogs)")
    public void logPointCut() {}

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        try {
            saveLog(point, time);
        } catch (Exception e) {
        }
        return result;
    }
    /**
     * 保存日志
     * @param joinPoint
     * @param time
     */
    private void saveLog(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        MyLogs myLogs = method.getAnnotation(MyLogs.class);
        //请求的 类名、方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = method.getName();
        //请求的参数
        Object[] args = joinPoint.getArgs();
        StringBuilder builder = new StringBuilder();
        try{
            List<String> list = new ArrayList<String>();
            for (Object o : args) {
                builder.append(new Gson().toJson(o)).append("\t");
            }
        }catch (Exception e){}
        log.info(time+"\t"+myLogs.value()+"\t"+myLogs.ignore()+"\t"+className+"\t"+methodName+"\t"+builder);
    }
}
