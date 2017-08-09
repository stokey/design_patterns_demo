package com.stokey.designpattern.struct.brigde;

/**
 * Created by tiangen on 2017/8/9.
 */

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    private Implementor implementor;
    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    // 自身行为和属性
    public void request(){
        this.implementor.doSomething();
    }

    // 获得实现化角色
    public Implementor getImplementor(){
        return this.implementor;
    }
}
