package com.反射.JDK动态代理;

import com.反射.service.HelloService;
import com.反射.service.impl.HelloServiceImpl;

public class ProxyTest {
    public static void main(String[] args) {
        HelloServiceProxy HelloHandler = new HelloServiceProxy();
        HelloService procy = (HelloService) HelloHandler.bind(new HelloServiceImpl());
        procy.sayHello("World");
    }
}