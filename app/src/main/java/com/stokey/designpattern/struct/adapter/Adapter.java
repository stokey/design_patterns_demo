package com.stokey.designpattern.struct.adapter;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 适配器角色——组合两个或多个类/接口关系
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
