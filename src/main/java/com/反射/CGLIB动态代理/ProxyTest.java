package com.反射.CGLIB动态代理;

import com.反射.service.impl.HelloServiceImpl;

public class ProxyTest {
    public static void main(String[] args) {
        HelloServiceCgLib hello = new HelloServiceCgLib();
        HelloServiceImpl proxyImpl = (HelloServiceImpl)hello.getInstance(HelloServiceImpl.class);
        proxyImpl.sayHello("hello");
    }
}