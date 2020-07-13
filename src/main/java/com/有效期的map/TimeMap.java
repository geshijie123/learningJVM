package com.有效期的map;

import net.jodah.expiringmap.ExpirationPolicy;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

public class TimeMap {
    public static void main(String[] args) {
        /**
         *expiration(5000,TimeUnit.MILLISECONDS)
         *设置过期时间为5秒
         *ExpirationPolicy.CREATED)
         *设置过期策略为创建或更新值后
         */
        ExpiringMap<String, String> map = ExpiringMap.builder().expiration(5000, TimeUnit.MILLISECONDS)
                .expirationPolicy(ExpirationPolicy.ACCESSED)
                .build();
        map.put("key","value");
        System.out.println("key:"+map.get("key"));
        //等待5秒
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map.get("key"));
    }
}
