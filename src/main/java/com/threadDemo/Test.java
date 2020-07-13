package com.threadDemo;

public class Test {
   private static Express express = new Express(0,"上海");




    public static void main(String[] args) throws InterruptedException {


        new Thread(()->express.waitKm()).start();
        new Thread(()->express.waitKm()).start();
        new Thread(()->express.waitKm()).start();
        new Thread(()->express.waitSite()).start();
        new Thread(()->express.waitSite()).start();
        new Thread(()->express.waitSite()).start();



        Thread.sleep(1000);

        express.changeKm();
        express.changeSite();

    }
}
