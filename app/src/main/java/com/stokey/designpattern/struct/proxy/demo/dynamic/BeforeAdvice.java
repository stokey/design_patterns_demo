package com.stokey.designpattern.struct.proxy.demo.dynamic;

/**
 * Created by stokey on 2017/8/17.
 */

/**
 * 通知实现类
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("Before Advice exec");
    }
}
