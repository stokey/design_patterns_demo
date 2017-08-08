package com.stokey.designpattern.struct.decorator;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 面向对象设计中，如果超过两层继承，就应该想想是不是设计出了问题
 *
 * 装饰模式——包装模式之一（适配器模式）
 *
 * 动态的给一个对象添加一些额外的职责
 * 就增加功能来说，装饰模式比生成子类更为灵活
 *
 * 在装饰模式中，必然有一个最基本、最核心、最原始的接口或抽象类充当Component抽象构件
 * 构成：
 * 1、Component
 * 2、ConcreteComponent
 * 3、Decorator
 * 4、ConcreteDecorator1
 *
 * 优点：
 * 1、装饰类和被装饰类可以独立发展，而不会相互耦合
 * 2、装饰模式是继承关系的一个替代方案
 * 3、装饰模式可以动态的扩展一个实现类的功能
 *
 * 缺点：
 * 多层装饰是比较复杂的。应该尽量减少装饰类的数量，以便降低系统的复杂度
 *
 * 使用场景：
 * 1、需要扩展一个类的功能，或给一个类增加附加功能
 * 2、需要动态的给一个对象增加功能，并且这些功能可以动态的撤销
 * 3、需要为一批兄弟类进行改装或加装功能
 */
public class Client {
    public static void main(String[] args){
        Component component1 = new ConcreteComponent();
        // 第一次装饰
        component1 = new ConcreteDecorator1(component1);
        // 第二次装饰
        component1 = new ConcreteDecorator2(component1);
        component1.operate();
    }
}
