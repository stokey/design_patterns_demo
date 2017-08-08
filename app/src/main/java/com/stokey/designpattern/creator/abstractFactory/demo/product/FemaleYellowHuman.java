package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("Female Yellow woman");
    }
}
