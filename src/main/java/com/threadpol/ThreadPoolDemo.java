package com.threadpol;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {

//        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
//
//
//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
//        ExecutorService pool = new ThreadPoolExecutor(5, 200,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
//        pool.execute(()-> System.out.println(Thread.currentThread().getName()));
//        pool.shutdown();//gracefully shutdown


//    <bean id="userThreadPool"
//        class="org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor">
//        <property name="corePoolSize" value="10" />
//        <property name="maxPoolSize" value="100" />
//        <property name="queueCapacity" value="2000" />
//        <property name="threadFactory" value= threadFactory />
//        <property name="rejectedExecutionHandler">
//            <ref local="rejectedExecutionHandler" />
//        </property>
//    </bean>
//   代码里   userThreadPool.execute(thread);

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            try {
                //sleep可明显看到使用的是线程池里面以前的线程，没有创建新的线程
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(() -> System.out.println(Thread.currentThread().getName() + "正在被执行"));
        }
    }
}