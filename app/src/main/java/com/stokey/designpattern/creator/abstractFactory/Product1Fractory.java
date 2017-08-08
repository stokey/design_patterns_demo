package com.stokey.designpattern.creator.abstractFactory;

import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductA;
import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductB;
import com.stokey.designpattern.creator.abstractFactory.product.ProductA1;
import com.stokey.designpattern.creator.abstractFactory.product.ProductB1;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 产品等级==1的实现类
 */
public class Product1Fractory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
