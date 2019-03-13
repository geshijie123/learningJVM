package com.jvm.demo1;

import java.net.URLEncoder;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {

        HashMap<String,Object>  map=new HashMap<String, Object>();
        map.put("1","");
        int signUpFrom=map.get("1")==null?0:Integer.valueOf(map.get("1").toString());
        System.out.println(signUpFrom);

    }
}
