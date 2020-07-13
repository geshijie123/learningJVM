package com.LRU;

import java.util.concurrent.locks.ReentrantLock;

public class test {
    public synchronized  static void main(String[] args) {

        LruCache lruCache=new LruCache(4);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        lruCache.put(5,50);

        lruCache.put(2,22);

        System.out.println(lruCache.get(2).value);

    }
}
