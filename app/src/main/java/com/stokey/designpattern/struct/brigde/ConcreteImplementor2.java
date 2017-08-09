package com.stokey.designpattern.struct.brigde;

/**
 * Created by tiangen on 2017/8/9.
 */

public class ConcreteImplementor2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor2 is doing something");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor2 is doing anything");
    }
}
