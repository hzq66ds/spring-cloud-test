package com;

import com.classloader.ClassLoaderTest;
import com.demo.Demo;
import com.demo.Demo001;
import com.demo.ProxyFactory;
import com.interfacetest.Test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Stream{
    public static Log log = LogFactory.getLog(Stream.class);
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        ClassLoader classLoader = new ClassLoaderTest();
//        Class classtype = classLoader.loadClass("com.demo.Demo");
//        Demo demo = (Demo)classtype.newInstance();
//        demo.setName("test");
//        System.out.println(demo.getName());
        Test demoproxy = (Test)Proxy.newProxyInstance(Demo.class.getClassLoader(), Demo.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("向观众问好");
                //执行目标对象方法
                Object returnValue = method.invoke(Demo.class.newInstance(), args);
                System.out.println("谢谢大家");
                return returnValue;
            }
        });
        demoproxy.sing("aaa","bbb");

        ProxyFactory proxyFactory = new ProxyFactory(Demo001.class);
        Demo demoproxy1 = (Demo)proxyFactory.getProxyInstance();
        demoproxy1.sing("aaa","bbb");


        ProxyFactory proxyFactory1 = new ProxyFactory(Demo.class);
        Demo demoproxy2 = (Demo)proxyFactory.getProxyInstance();
        demoproxy2.sing("aaa1","bbb1");

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("aa");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        Lock lock = new ReentrantLock();
        lock.newCondition().signal();

    }

}
