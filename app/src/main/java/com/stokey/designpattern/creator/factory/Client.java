package com.stokey.designpattern.creator.factory;

/**
 * Created by tiangen on 2017/8/8.
 */

import com.stokey.designpattern.creator.factory.product.ConcreteProduct1;
import com.stokey.designpattern.creator.factory.product.ConcreteProduct2;
import com.stokey.designpattern.creator.factory.product.Product;

/**
 * 工厂方法模式
 *
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类
 * 使一个类的实例化延迟到其子类
 *
 * 优点：
 * 1、良好的封装性，代码结构清晰（只需要类名或者约束字符串即可创建对象）
 * 2、扩展性优秀，在增加产品类的情况下，只需要适当修改具体工厂类或扩展一个工厂类
 * 3、屏蔽了产品类，调用者不用关心产品变化和实现
 * 4、典型解耦框架
 *
 * 使用场景：
 * 1、工厂方法模式是new一个对象的替代品
 * 2、需要灵活的、可扩展的框架
 * 3、异构项目中
 * 4、测试驱动开发的框架下
 */

public class Client {
    public static void main(String[] args){
        Factory factory = new ConcreteFactory();
        Product product1 = factory.createProduct(ConcreteProduct1.class);
        // 继续处理业务逻辑

        Product product2 = factory.createProduct(ConcreteProduct2.class);
    }
}
