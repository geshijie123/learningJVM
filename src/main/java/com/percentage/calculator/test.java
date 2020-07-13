package com.percentage.calculator;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        
        String a = "{\"85023781058:7127c2363f42645\":\"45|1|85023781058\",\"85023781059:034ef8570b4149f\":\"45|1|85023781059\",\"85023781060:8393e6c66a42e81\":\"45|1|85023781060\"}";
        JSONObject s=new JSONObject(a);
        Set<String> strings = s.keySet();
        strings.stream().forEach(one ->{
            System.out.println(one);
            System.out.println(s.get(one));

        });

    }
}
