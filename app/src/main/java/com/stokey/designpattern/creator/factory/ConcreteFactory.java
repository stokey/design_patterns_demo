package com.stokey.designpattern.creator.factory;

/**
 * Created by tiangen on 2017/8/8.
 */

/**
 * 具体工厂类
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = ( Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
