package com.jvm.新生代MinorGC;

import java.util.ArrayList;
import java.util.List;

public class demo {
    private static final int _1MB = 1024 * 1024;

    /**
     *  vm 参数 -verbose:gc  -Xms20M  -Mmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testALLocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1= new byte[2*_1MB];
        allocation2= new byte[2*_1MB];
        allocation3= new byte[2*_1MB];
        allocation4= new byte[4*_1MB];//出现gc
    }

    public static void main(String[] args) {
        testALLocation();


    }
}
