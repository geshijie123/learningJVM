package com.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author geshijie
 * @date 2019-06-20 15:10
 */
public class UserApi {

    /** 查询用户基本信息，模拟耗时150ms */
    public String queryUserInfo(long userId) {
        String userInfo = "userInfo: " + userId;

        try {
            TimeUnit.MILLISECONDS.sleep(150L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    /** 查询用户地址，模拟耗时200ms */
    public String queryUserAddress(long userId) {
        String userAddress = "userAddress: " + userId;

        try {
            TimeUnit.MILLISECONDS.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userAddress;
    }
}