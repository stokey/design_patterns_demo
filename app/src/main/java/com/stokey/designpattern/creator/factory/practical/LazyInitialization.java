package com.stokey.designpattern.creator.factory.practical;

import com.stokey.designpattern.creator.factory.ConcreteProduct1;
import com.stokey.designpattern.creator.factory.ConcreteProduct2;
import com.stokey.designpattern.creator.factory.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiangen on 2017/8/8.
 */

/**
 * 延迟加载的工厂类
 */
public class LazyInitialization {
    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.toLowerCase().equals("product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type.toLowerCase(), product);
        }
        return product;
    }
}
