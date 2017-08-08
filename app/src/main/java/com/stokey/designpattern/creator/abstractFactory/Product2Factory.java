package com.stokey.designpattern.creator.abstractFactory;

import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductA;
import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductB;
import com.stokey.designpattern.creator.abstractFactory.product.ProductA2;
import com.stokey.designpattern.creator.abstractFactory.product.ProductB2;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 产品等级==2的实现类
 */
public class Product2Factory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
