package com.main;

import cn.hutool.poi.excel.ExcelUtil;

import java.util.concurrent.TimeUnit;

public class Main1209 {
    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (flag) {
                if(flag){
                    System.out.println(1);
                }
                i++;
            }
            System.out.println(i);
        }).start();
        TimeUnit.SECONDS.sleep(2);
        Main1209.flag = false;
        System.out.println("设置为false");
    }
}
