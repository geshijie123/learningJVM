package com.状态模式;

public class LG_TVdo implements TVdo {
    @Override
    public void nest() {
        System.out.println("下调一个");
    }

    @Override
    public void last() {
        System.out.println("上调一个");
    }
}
