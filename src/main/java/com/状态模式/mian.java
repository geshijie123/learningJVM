package com.状态模式;

public class mian {

    public static void main(String[] args) {

        LG_TV lg_tv=new LG_TV();
        lg_tv.turnOn();
        lg_tv.last();
        lg_tv.last();
        lg_tv.nest();
        lg_tv.turnOff();
        lg_tv.last();
    }
}
