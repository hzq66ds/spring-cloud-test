package com.threadSafe;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conditiontest {
    public static final Log log = LogFactory.getLog(Conditiontest.class);
    public static void main(String[] args) {

        Resource resource = new Resource();
        List<Runnable> runnableList = new ArrayList<>(3);
        runnableList.add(()->{resource.printNum(resource.condition1,resource.condition2);});
        runnableList.add(()->{resource.printNum(resource.condition2,resource.condition3);});
        runnableList.add(()->{resource.printNum(resource.condition3,resource.condition1);});
        int index = 0;
        for (Runnable runnable:runnableList) {
            index++;
            new Thread(runnable,"thread"+index).start();
        }
    }
    static class Resource{
        int num = 0;
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();
        public void printNum(Condition self,Condition next){
            try {
                lock.lock();
                while (num<=99){
                    //先唤醒线程，再将当前线程休眠
                    next.signal();
                    self.await();
                    log.debug(num);
                    num++;
                }
                next.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
