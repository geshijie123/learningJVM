package com.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonTest {
    public static void main(String[] args) {

        Config config = new Config();

        config.useSingleServer().setAddress("redis://127.0.0.1:6379").setPassword("123456");

        RedissonClient redissonClient = Redisson.create(config);

        redissonClient.getKeys();


    }
}
