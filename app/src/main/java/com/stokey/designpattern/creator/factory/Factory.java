package com.stokey.designpattern.creator.factory;

/**
 * Created by tiangen on 2017/8/8.
 */

/**
 * 抽象工厂类
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
