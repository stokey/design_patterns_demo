package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void talk() {
        System.out.println("Yellow people talk");
    }

    @Override
    public void getColor() {
        System.out.println("Yellow people is yellow");
    }
}
