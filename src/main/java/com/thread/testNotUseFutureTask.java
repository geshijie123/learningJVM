package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author geshijie
 * @date 2019-06-20 15:10
 */
public class testNotUseFutureTask {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UserApi userApi = new UserApi();
        long userId = 12;
        long startTime = System.currentTimeMillis();



//        未使用 futureTask
//        // 获取用户基本信息
//        String userInfo = userApi.queryUserInfo(userId);
//        // 获取用户地址
//        String userAddress = userApi.queryUserAddress(userId);

        Callable<String> userInfoCallable = () -> userApi.queryUserInfo(userId);
        Callable<String> userAddressCallable = () -> userApi.queryUserAddress(userId);
        FutureTask<String> userInfoFutureTask = new FutureTask<>(userInfoCallable);
        FutureTask<String> userAddressFutureTask = new FutureTask<>(userAddressCallable);
        new Thread(userInfoFutureTask).start();
        new Thread(userAddressFutureTask).start();
        String userInfo = userInfoFutureTask.get();
        String userAddress = userAddressFutureTask.get();



        System.out.println(userInfo+userAddress);
        System.err.println("testUseFutureTask 耗时：" + (System.currentTimeMillis() - startTime));
    }
}
