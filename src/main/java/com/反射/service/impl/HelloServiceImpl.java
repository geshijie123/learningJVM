package com.反射.service.impl;

import com.反射.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String str) {
        // TODO Auto-generated method stub
        System.out.println("Hello" + str);
    }

}