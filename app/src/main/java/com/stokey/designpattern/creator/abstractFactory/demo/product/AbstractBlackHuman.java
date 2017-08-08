package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void talk() {
        System.out.println("Black people talk");
    }

    @Override
    public void getColor() {
        System.out.println("Black people is black");
    }
}
