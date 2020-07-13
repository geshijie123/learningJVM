package com.延时队列;

import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Message implements Delayed {
    private String body;

    private long delayTime;

    private long putTime;


    /**
     * 用于返回剩余时间
     * 消息是否到期则是通过此方法判断
     * 返回小于等于0则到期
     */
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(putTime + delayTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /**
     * 因为Delayed继承于Comparable
     * 所以需要实现compareTo方法,用于排序
     * 该对象(this)小于、等于或大于指定对象(o)，则分别返回负整数、零或正整数。
     */
    @Override
    public int compareTo(Delayed o) {
        long result = this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // getter/setter

    public Message(String body, long delayTime) {
        this.body = body;
        this.delayTime = delayTime;
        this.putTime = new Date().getTime();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(long delayTime) {
        this.delayTime = delayTime;
    }

    public long getPutTime() {
        return putTime;
    }

    public void setPutTime(long putTime) {
        this.putTime = putTime;
    }
}
