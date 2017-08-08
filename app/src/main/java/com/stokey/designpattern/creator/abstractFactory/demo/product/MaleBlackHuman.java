package com.stokey.designpattern.creator.abstractFactory.demo.product;

/**
 * Created by stokey on 2017/8/8.
 */

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("Male Black man");
    }
}
