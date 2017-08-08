package com.stokey.designpattern.creator.abstractFactory;

/**
 * Created by stokey on 2017/8/8.
 */

import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductA;
import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductB;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
