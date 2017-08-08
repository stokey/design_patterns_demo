package com.stokey.designpattern.creator.abstractFactory;

/**
 * Created by stokey on 2017/8/8.
 */

import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductA;
import com.stokey.designpattern.creator.abstractFactory.product.AbstractProductB;

/**
 * 抽象工厂模式
 *
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类
 *
 * 有M个产品等级就应该有M个实现工厂类，每个实现工厂中，实现不同产品族的生成任务
 *
 * 优点：
 * 1、封装性，高层模块不关心每个产品的实现类
 * 2、产品族内的约束为非公开状态
 *
 * 缺点：
 * 产品族扩展非常困难——抽象类AbstractFactory需要调整
 *
 * 使用场景：
 * 1、一个对象族（或者是一组没有任何关系的对象）都有相同的约束
 * 2、涉及不同操作系统时
 *
 * AbstractFactory vs Factory
 * 1、抽象工厂模式中抽象工厂类可以创建出多种不同产品对象，并且可以对产品对象进行二次抽象（分级别）
 * 2、工厂方法模式中抽象工厂类只能创建一种产品对象
 */
public class Client {
    public static void main(String[] args){
        AbstractFactory factory1 = new Product1Fractory();
        AbstractFactory factory2 = new Product2Factory();

        // 生产A1对象
        AbstractProductA productA1 = factory1.createProductA();
        // 生产B1对象
        AbstractProductB productB1 = factory1.createProductB();
        // 生产A2对象
        AbstractProductA productA2 = factory2.createProductA();
        // 生产B2对象
        AbstractProductB productB2 = factory2.createProductB();
    }
}
