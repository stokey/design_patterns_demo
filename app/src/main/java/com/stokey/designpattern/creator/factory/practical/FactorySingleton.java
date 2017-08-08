package com.stokey.designpattern.creator.factory.practical;

/**
 * Created by tiangen on 2017/8/8.
 */

import com.stokey.designpattern.creator.singleton.Singleton;

import java.lang.reflect.Constructor;

/**
 * 负责生成单例的工厂类
 */
public class FactorySingleton {
    private static Singleton singleton;

    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor constructor = cl.getEnclosingConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            try {
                singleton = (Singleton) constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
