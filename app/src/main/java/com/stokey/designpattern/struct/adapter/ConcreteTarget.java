package com.stokey.designpattern.struct.adapter;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 目标角色的实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget request call");
    }
}
