package com.状态模式;

public class LJ_TVdo implements TVdo {
    @Override
    public void nest() {
        System.out.println("请开机");
    }

    @Override
    public void last() {
        System.out.println("请开机");
    }
}
