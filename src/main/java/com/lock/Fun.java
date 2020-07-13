package com.lock;

public class Fun {

    public String fun(String orderId){

        synchronized (orderId){


            System.out.println(System.currentTimeMillis()+"----"+orderId+"------"+Thread.currentThread().getName());
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return orderId;
        }

    }
}
