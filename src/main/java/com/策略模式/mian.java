package com.策略模式;

public class mian {
    public static void main(String[] args) {

        Calculator calculator=new Calculator(new BusUtil());
        calculator.money();

    }
}
