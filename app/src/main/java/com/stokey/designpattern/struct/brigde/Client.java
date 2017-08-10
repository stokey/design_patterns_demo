package com.stokey.designpattern.struct.brigde;

/**
 * Created by tiangen on 2017/8/9.
 */

/**
 * 桥梁模式
 * <p>
 * 将抽象和实现解耦，使得两者可以独立变化
 * <p>
 * 构成：
 * 1、Abstraction——抽象化角色
 * 2、Implementor——实现化角色
 * 3、RefinedAbstraction——修正抽象化角色
 * 4、ConcreteImplementor——具体实现化角色
 * <p>
 * 抽象角色引用实现角色——抽象角色的部分实现是由实现角色完成
 * <p>
 * 优点：
 * 1、抽象和实现分离：解决继承的缺点，该模式下实现不受抽象的约束，不用再绑定在一个固定的抽象层次上
 * 2、优秀的扩展能力
 * 3、实现细节对客户透明
 * <p>
 * 使用场景：
 * 1、不希望或不实用使用继承的场景
 * 2、接口或抽象类不稳定的场景（会发生变化）
 * 3、重用性要求较高的场景：设计的颗粒度越细，被重用的可能性就越大
 * <p>
 * 注意事项：
 * 1、桥梁模式意图是对变化的封装，尽量把可能变化的因素封装到最细、最小的逻辑单元中，避免风险扩散
 * 2、系统设计时，发现类的继承有N层时，可以考虑使用桥梁模式
 * <p>
 * Bridge VS Decorator
 * <p>
 * 异同点：
 * <p>
 * 相同点：
 * 1、都是可以类继承的替代方案——继承具有强侵入性（父类改变时会影响所有子类）
 * 2、都可以对类进行扩展和改装
 * <p>
 * 不同点：
 * 1、装饰者模式侧重对现有类的扩展和改装，桥梁模式侧重将抽象与实现解耦（继承--> 耦合（持有抽象角色持有实现角色））
 * 2、Decorator继承自Component，Abstraction持有Implementor引用
 * 3、装饰者模式最终使用的还是Component（Implementor），桥梁模式最终使用的是Abstraction
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        abs.request();
    }
}
