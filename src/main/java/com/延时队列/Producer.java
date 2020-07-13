package com.延时队列;

import java.util.concurrent.DelayQueue;

public class Producer {
    public static void main(String[] args) {
        DelayQueue<Message> queue = new DelayQueue<>();

        // 延时5秒
        Message m1 = new Message("go？", 2000);

        // 延时15秒
        Message m2 = new Message("go！", 5000);

        // 将延时消息放到延时队列
        queue.add(m1);
        queue.offer(m2);

        new Thread(new Consumer(queue)).start();
        queue.add(m1);
        queue.add(m1);
        queue.add(m1);
        queue.add(m1);
        queue.add(m1);

        System.out.println("wait~~");
    }

}
