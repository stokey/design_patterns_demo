package com.stokey.designpattern.struct.proxy.demo.dynamic;

/**
 * Created by stokey on 2017/8/17.
 */

import java.lang.reflect.InvocationHandler;

/**
 * 动态代理
 */

public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        // 定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

        proxy.doSomething("Finish");
    }
}
