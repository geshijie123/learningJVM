package com.打印奇偶数;

import java.util.concurrent.TimeUnit;

/**
 * User:
 * Date:        2019/7/3 14:59
 * Description:
 */
public class PrintOdd {
    public static void main(String[] args){

        MyPrint print = new MyPrint();

        Thread thread = new Thread(print,"线程1");
        Thread thread1 = new Thread(print,"线程2");

        thread.start();
        thread1.start();
    }

}

class MyPrint implements Runnable{
    private int i = 1;

    @Override
    public void run() {
        println();
    }

    private synchronized void println(){

        while (true){
            try {
                TimeUnit.SECONDS.sleep(1L);
            }catch (Exception e){
                e.printStackTrace();
            }
            notifyAll();
            System.out.println(Thread.currentThread().getName()+"打印： "+i);
            i++;
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
