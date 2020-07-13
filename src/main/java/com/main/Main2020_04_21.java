package com.main;

import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main2020_04_21 {


//    static ConcurrentHashMap<Integer ,Integer> map=new ConcurrentHashMap<>(128);
    static Map<Integer ,Integer> map=new HashMap<>(128);

//    static AtomicInteger a=new AtomicInteger();
    static Integer a=0;


    public static void main(String[] args) {

//        a.set(0);

        for (int i=0;i<200;i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
//                    int andAdd = a.getAndAdd(1);
                    int andAdd = a++;
                    map.put(andAdd,2323);
//                    System.out.print(andAdd+",");

                }
            }).start();

        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map.size());
//        System.out.println(a.get());
        System.out.println(a);
    }

}
