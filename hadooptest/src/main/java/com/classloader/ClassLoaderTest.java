package com.classloader;

import java.util.concurrent.locks.Lock;

public class ClassLoaderTest extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }

    public static void main(String[] args) {
        new Thread(()->{
            while (true);
        },"test001").start();
        new Thread(()->{
            Object obj = new Object();
            synchronized (obj){
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"test002").start();
    }
}
