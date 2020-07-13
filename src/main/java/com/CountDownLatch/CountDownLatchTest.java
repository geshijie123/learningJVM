package com.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        new Thread(()->{
            System.out.println(countDownLatch.getCount() + "thread run~");
            try {
                Thread.sleep(3000);
                System.out.println(countDownLatch.getCount() +  "thread sleep~");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println(countDownLatch.getCount() +  "thread sleep~");
        }).start();

        try {
            System.out.println( countDownLatch.getCount() + "wait~");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println( countDownLatch.getCount() +  "over~");

    }
}
