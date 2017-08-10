package com.stokey.designpattern.struct.adapter;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 适配器模式——补偿模式，用于解决接口不相容问题
 * <p>
 * 出现：新接口/类 --不兼容-- 老系统
 * 解决：新接口/类 --Adaptee--> 其他接口/类（兼容老系统）
 * <p>
 * 将一个类的接口换成客户端所期待的另一种接口
 * 从而是原本接口不匹配而无法在一起工作的两个类能够在一起工作
 * <p>
 * 适配器模式是一种包装模式——1、适配器模式 2、装饰模式
 * <p>
 * 优点：
 * 1、可以让两个没有任何关系的类在一起运行
 * 2、增加了类的透明性——Target目标角色的具体实现委托给了源角色
 * 3、提高了类的复用度
 * 4、灵活性非常好
 * <p>
 * 构成：
 * 1、Target
 * 2、ConcreteTarget
 * 3、Adaptee
 * 4、Adapter
 * <p>
 * 使用场景：
 * 1、有动机修改一个已经投产中的接口时，适配器模式可能是最适合的模式
 * 2、系统扩展后，需要使用已有或新建的类，但该类不符合系统接口时
 * <p>
 * 注意事项：
 * 详细设计阶段不要考虑使用它，不是为了解决还处于开发阶段的问题。它是为了解决正在服役的项目的问题
 */
public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target1 = new ConcreteTarget();
        target1.request();

        // 现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
