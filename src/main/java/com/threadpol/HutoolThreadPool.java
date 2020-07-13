package com.threadpol;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.thread.ThreadUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class HutoolThreadPool {
    public static void main(String[] args)  {
        System.out.println("cpu  核心数量"+Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = ThreadUtil.newExecutor(Runtime.getRuntime().availableProcessors());
        TimeInterval timer = DateUtil.timer();
        timer.start();

        for(int i=0;i<100;i++){
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+"线程 运行 str>>>>>>>");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程 运行 end<<<<<<<");
            });
        }

        try {
            executorService.awaitTermination(10,TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String a="aaa";
        System.out.println(a.substring(0,7));
        while (!executorService.isTerminated()){
            System.out.println("thread is not over !!!!!!!!!!!!!!!运行时间："+timer.intervalSecond()+"s  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        }
        System.out.println("overoveroveroveroveroveroveroveroverovero运行时间："+timer.intervalSecond()+"sveroveroveroveroveroveroveroveroveroveroverover");
    }
}
