package com.stokey.designpattern.struct.facade;

/**
 * Created by tiangen on 2017/8/10.
 */

/**
 * 门面对象
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();

    public void doSomethingA() {
        this.a.doSomething();
    }

    public void doSomethingB() {
        this.b.doSomething();
    }
}
