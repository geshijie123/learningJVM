package com.threads;

import org.omg.IOP.TAG_JAVA_CODEBASE;

import java.util.concurrent.*;

public class SimpleThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Callable<String> callable=new Callable<String>() {
            @Override
            public String call() throws Exception {

                Thread.currentThread().isInterrupted();

                Thread.sleep(2000);
                return "23333";
            }
        };

        FutureTask<String> futureTask=new FutureTask<>(callable);
        new Thread(futureTask).start();
        System.out.println("main");
        String s = null;
        try {
            s = futureTask.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("异常");
        }
        System.out.println(s);

        s = futureTask.get();
        System.out.println(s);


        }
    }


