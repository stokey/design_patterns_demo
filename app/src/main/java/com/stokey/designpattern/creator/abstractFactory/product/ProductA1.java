package com.stokey.designpattern.creator.abstractFactory.product;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 产品等级==1的实现类A1
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("Product A1 do something");
    }
}
