package com.main;

import java.util.HashSet;
import java.util.Set;

public class Main20200327 {
    public static void main(String[] args) {

        Set<Long> longs=new HashSet<>();
//        longs.add(1L);
//        longs.add(2L);
//        longs.add(2L);
//        longs.add(2L);
        System.out.println(longs.toString().replace("[","").replace("]","").replace(" ",""));
    }
}
