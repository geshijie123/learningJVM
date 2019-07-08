package com.状态模式;

public class LG_TV  implements TVdo ,TVstatus {


    private  TVdo tVdo;


    @Override
    public  void turnOn() {
        System.out.println("开机");
        tVdo=new LG_TVdo();
    }
    @Override
    public  void turnOff() {
        System.out.println("关机");
        tVdo=new LJ_TVdo();
    }
    @Override
    public   void nest() {
        tVdo.nest();
    }

    @Override
    public   void last() {
        tVdo.last();
    }


}
