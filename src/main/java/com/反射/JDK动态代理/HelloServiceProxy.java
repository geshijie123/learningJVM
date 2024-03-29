package com.反射.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {

    /**
     * 真实的服务对象
     */
    private Object target;

    /**
     * 绑定一个委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target){
        this.target = target;
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return proxy;
    }

    /**
     * 通过代理对象调用方法首先进入这个方法
     * @param proxy 代理对象
     * @param method 被调用方法
     * @param args 方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("我是JDK代理");
        Object result = null;
        //反射方法调用前
        System.out.println("开始调用方法");
        //执行方法，相当于调用HelloServiceImpl的sayHello方法
        result = method.invoke(target, "world");
        //反射方法调用后
        System.out.println("调用方法完成");
        return result;
    }

}