package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("White people talk");
    }

    @Override
    public void getColor() {
        System.out.println("White people is white");
    }
}
