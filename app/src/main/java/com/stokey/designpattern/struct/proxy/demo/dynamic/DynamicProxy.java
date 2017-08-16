package com.stokey.designpattern.struct.proxy.demo.dynamic;

/**
 * Created by stokey on 2017/8/17.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if (true){
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
