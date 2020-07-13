package com.lock;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Callable<String> callable=() -> new Fun().fun("2333");
//        FutureTask<String> futureTask = new FutureTask<>(callable);
//        new Thread(futureTask).start();
//        new Thread(new FutureTask<>(() -> new Fun().fun("2333"))).start();
//        new Thread(new FutureTask<>(() -> new Fun().fun("2333"))).start();
//        new Thread(new FutureTask<>(() -> new Fun().fun("666"))).start();
//        new Thread(new FutureTask<>(() -> new Fun().fun("777"))).start();

        new Thread(()->new Fun().fun("233")).start();
        new Thread(()->new Fun().fun("233")).start();
        new Thread(()->new Fun().fun("666")).start();
        new Thread(()->new Fun().fun("777")).start();

    }
}
