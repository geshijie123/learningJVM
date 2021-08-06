package com.反射.CGLIB动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloServiceCgLib implements MethodInterceptor {

    private Object target;
    /**
     * 创建代理对象
     * @param target
     * @return
     */
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    //回调方法
    public Object intercept(Object obj, Method methoc, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我是cglib动态代理");
        //反射方法调用前
        System.out.println("开始调用");
        Object returnObj = proxy.invokeSuper(obj, args);
        //反射方法调用之后
        System.out.println("调用完成");

        return returnObj;
    }
}