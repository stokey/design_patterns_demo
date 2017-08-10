package com.stokey.designpattern.struct.flyweight;

/**
 * Created by stokey on 2017/8/11.
 */

import java.util.HashMap;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    // 定一个池容器
    private static HashMap<String,Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;
        if (!pool.containsKey(extrinsic)){
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic,flyweight);
        } else {
            flyweight = pool.get(extrinsic);
        }
        return flyweight;
    }
}
