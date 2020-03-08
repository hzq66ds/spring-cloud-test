package com;

import com.fasterxml.jackson.core.JsonParser;
import org.aspectj.util.LangUtil;
import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.SingleThreadModel;
import java.security.PrivilegedAction;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author HZQ-PC
 */
@SpringBootApplication
@RefreshScope
@RestController
public class HadoopApplication {
	public static void main(String[] args) {
//		SpringApplication.run(HadoopApplication.class, args);


		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
				//核心线程数
				1,
				//最大线程数
				10,
				//存货时长
				1, TimeUnit.DAYS,
				//线程队列
				new SynchronousQueue<>(),
				//线程工厂
				new MyThreadFactory("test"),
				//线程饱和策略，AbortPolicy终止,CallerRunsPolicy调用者运行,DiscardPolicy抛弃,DiscardOldestPolicy抛弃最早
				new ThreadPoolExecutor.DiscardPolicy());
		for (int i = 0; i < 10; i++) {
			final int i_temp = i;
			System.out.println(i_temp);
			poolExecutor.submit(()->{
				try {
					System.out.println(i_temp+"----------------start");
					Thread.sleep(3000);
				}catch (Exception e){
					e.printStackTrace();
				}
			});
		}
		poolExecutor.shutdown();
		System.out.println("----------------线程提交完成");

		ExecutorService executorService = Executors.newWorkStealingPool();
		Teacher teacher = new Teacher();
		teacher.setName("teacher_name");
		teacher.setMsg("teacher_msg");
		Future<Teacher> future = executorService.submit(new MyCallAble(teacher));
		try {
			System.out.println(future.get().toString());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

class MyThreadFactory implements ThreadFactory{
	private String poolName;
	public MyThreadFactory(String poolName) {
		this.poolName=poolName;
	}

	@Override
	public Thread newThread(Runnable r) {
		return new MyThread(r,poolName);
	}
}
class MyThread extends Thread{
	private static final AtomicInteger num=new AtomicInteger();
	Logger logger = Logger.getAnonymousLogger();

	/**
	 * Allocates a new {@code Thread} object. This constructor has the same
	 * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
	 * {@code (null, null, name)}.
	 *
	 * @param name the name of the new thread
	 */
	public MyThread() {
	}

	public MyThread(Runnable runnable, String poolName) {
		super(runnable,poolName+"_"+num.incrementAndGet());
	}

	@Override
	public void run() {
		logger.log(Level.ALL,"Create "+num);
		super.run();
	}
}

class MyRunnable implements Runnable{
	Logger logger = Logger.getAnonymousLogger();
	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		try {
			logger.log(Level.ALL,"-------MyRunnable---------start");
			Thread.sleep(10000);
			logger.log(Level.ALL,"-------MyRunnable---------end");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
class Teacher{
	private String name;
	private String msg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", msg='" + msg + '\'' +
				'}';
	}
}
class MyCallAble implements Callable<Teacher>{
	Teacher teacher;
	public MyCallAble(Teacher t) {
		this.teacher=t;
	}

	/**
	 * Computes a result, or throws an exception if unable to do so.
	 *
	 * @return computed result
	 * @throws Exception if unable to compute a result
	 */
	@Override
	public Teacher call() throws Exception {
		teacher.setName(teacher.getName()+"_end");
		teacher.setMsg(teacher.getMsg()+"_end");

		return teacher;
	}
}
