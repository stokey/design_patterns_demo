package com.stokey.designpattern.struct.brigde;

/**
 * Created by tiangen on 2017/8/9.
 */

public class ConcreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor1 is doing something");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor1 is doing anything");
    }
}
