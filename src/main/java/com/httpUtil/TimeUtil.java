package com.httpUtil;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;

public class TimeUtil {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(getRs())).start();
        new Thread(()-> System.out.println(getRs())).start();
        new Thread(()-> System.out.println(getRs())).start();
        new Thread(()-> System.out.println(getRs())).start();
        new Thread(()-> System.out.println(getRs())).start();
    }
    private static String getRs(){
        String post = "";
        try {
            post = HttpUtil.post("http://127.0.0.1/test/timetest", new HashMap<>(), 1000);
            System.out.println("rs>>>>"+post);
        }catch (HttpException e){
            if(e.getMessage().startsWith(" Read timed out")){
              return getRs();
            }
        }
        if (post.startsWith("error")){
             return getRs();
        }
        return post;
    }
}
