package com.责任链模式;

public class main {
    public static void main(String[] args) {


        Man oldman =new Man() {
            @Override
            protected int limit() {
                return 10000;
            }

            @Override
            protected void hendle(int money) {
                System.out.println("老人出了钱");
            }
        };
        Man man =new Man() {
            @Override
            protected int limit() {
                return 1000;
            }

            @Override
            protected void hendle(int money) {
                System.out.println("男人出了钱");
            }
        };
        Man youngman =new Man() {
            @Override
            protected int limit() {
                return 10;
            }

            @Override
            protected void hendle(int money) {
                System.out.println("年轻人出了钱");
            }
        };

        youngman.father=man;
        man.father=oldman;


        youngman.hendleRequest(3000);
    }
}
