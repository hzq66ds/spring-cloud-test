package com.example.demo;

import ch.qos.logback.core.util.TimeUtil;
import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/9/17.
 */
public class Test {
    public static Log log = LogFactory.getLog(Test.class);

    public static void main(String[] args) {
        //函数式编程
//        test001(1,2, (a,b)->{
//            log.debug("处理结果："+(a+b));
//        });
//        test002(1,2, (a,b)->{
//            return a+b;
//        });
//        test003();
//        test004();
        test005();
//        test006();

        BooleanSupplier booleanSupplier = ()->{return true;};

    }

    public static Test getTest(Supplier<Test> supplier) {
        return supplier.get();
    }

    //函数式编程001
    public static void test001(Integer a, Integer b, BiConsumer<Integer,Integer> biConsumer){
        log.debug("------test001 start------");
        biConsumer.accept(a,b);
        log.debug("------test001   end------");
    }

    //函数式编程002
    public static void test002(Integer a, Integer b, BiFunction<Integer,Integer,Integer> biFunction){
        log.debug("------test002 start------");
        log.debug(biFunction.apply(a,b));
        log.debug("------test002   end------");
    }

    public static void test003(){
        Test t= Test.getTest(Test::new);
        Optional<Test> optional = Optional.of(t);
        boolean b= optional.equals(optional);
        log.debug(b);
    }

    public static void test004(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
    public static void test005(){

        Semaphore semaphore = new Semaphore(2);
//        if (semaphore.tryAcquire()){
//            semaphore.release();
//        }

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 1L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                new MyThreadFactory("INITTHREAD"),
                //饱和策略，使用ThreadPoolExecutor.DiscardOldestPolicy等等，或者实现自定义饱和策略
//                new ThreadPoolExecutor.DiscardOldestPolicy()
                new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        System.out.println(Thread.currentThread().getName()+"_________饱和策略执行"+"_________"+r);
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        executor.submit(r);
                    }
                }
        );
        for (int i = 1; i <= 30; i++) {
            final int ii = i;
            System.out.printf("线程启动%d\n",i);
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"线程"+ii+"start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程"+ii+"end");
            });

        }
        threadPoolExecutor.shutdown();
    }
    public static AtomicInteger down= new AtomicInteger(-1);
    public static void test006(){
        List<String> threadName = new ArrayList<>(4);

        threadName.add("1");
        threadName.add("2");
        threadName.add("3");
        threadName.add("4");
//        threadName.stream().forEach(name->{
//            down.set(1);
//            while (down.getAndAdd(1)<10){
//                try {
//                    System.out.println(Thread.currentThread().getName()+"_______"+name+"_______"+ DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
//                    Thread.sleep(1000);
//                }catch (Exception e){}
//            }
//        });
        threadName.parallelStream().forEach(name->{
            while (down.getAndAdd(1)<40){
                try {
                    System.out.println(Thread.currentThread().getName()+"_______"+name+"_______"+down.get()+"_______"+ DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        });


//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1);
//        for (int i = 0; i < threadName.size(); i++) {
//            final String name = threadName.get(i);
//
//        }


    }
}
class MyThreadFactory implements ThreadFactory{
    private String name;
    public MyThreadFactory(String name) {
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("线程初始化"+r.toString());
        return new Thread( r, name);
    }
}