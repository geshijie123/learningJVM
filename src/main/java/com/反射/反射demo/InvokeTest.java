package com.反射.反射demo;

import java.lang.reflect.Method;

public class InvokeTest {
    public static void main(String[] args) throws Exception {
        //通过反射创建test对象
        Object test = Class.forName(Test.class.getName()).newInstance();
        //获取服务方法：sayHello
        Method method = test.getClass().getMethod("sayHello", String.class);
        //反射调用方法
        method.invoke(test, "world");
    }
}