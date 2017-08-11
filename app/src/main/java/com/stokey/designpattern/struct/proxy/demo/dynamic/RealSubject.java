package com.stokey.designpattern.struct.proxy.demo.dynamic;

/**
 * Created by stokey on 2017/8/17.
 */

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("Dynamic RealSubject doing something");
    }
}
