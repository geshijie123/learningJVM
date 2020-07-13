package com.redis;

import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

/**
 *  docker 镜像命令
    docker run -d --name myredis -p 6379:6379 redis --requirepass "xiawei"
 */
public class RedisTest {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1",6379);
//        jedis.auth("xiawei"); //设置密码
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.set("aaa","111");
        System.out.println(jedis.get("aaa"));
    }
}
