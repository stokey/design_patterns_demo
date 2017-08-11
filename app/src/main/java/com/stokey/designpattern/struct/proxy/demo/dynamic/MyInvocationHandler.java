package com.stokey.designpattern.struct.proxy.demo.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by stokey on 2017/8/17.
 */

/**
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理对象
    private Object object = null;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(this.object, objects);
    }
}
