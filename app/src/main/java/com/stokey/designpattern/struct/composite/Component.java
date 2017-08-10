package com.stokey.designpattern.struct.composite;

/**
 * Created by tiangen on 2017/8/10.
 */

/**
 * 抽象构件
 */
public abstract class Component {
    public void doSomething(){
        // 编写业务逻辑
        System.out.println("Component doing something");
    }
}
