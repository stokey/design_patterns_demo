package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("Male White man");
    }
}
