package com.stokey.designpattern.struct.flyweight;

/**
 * Created by stokey on 2017/8/10.
 */

/**
 * 享元模式——池技术（运用共享技术，使得一些细粒度的对象可以共享）
 * <p>
 * （不能在投产中项目删除代码，如果方法或类确实不再使用，增加@Deprecated注解，表示该方法或类已经过时）
 * <p>
 * 使用共享对象可有效地支持大量的细粒度的对象
 * 1、细粒度对象（便于重用或重构）
 * 2、共享对象
 * <p>
 * 细粒度对象 --> 对象数量多且性质相近
 * <p>
 * 1、内部状态：对象可共享出来的信息，存储在享元对象内部且不会随环境改变而改变
 * 2、外部状态：对象得以依赖的一个标记，随环境改变而改变、不可共享
 * <p>
 * 构成：
 * 1、Flyweight——抽象享元角色：产品抽象类，定义出对象的外部状态和内部状态的接口或实现
 * 2、ConcreteFlyweight——具体享元角色
 * 3、unsharedConcreteFlyweight——不可共享的享元角色：不存在外部状态或者安全要求（如线程安全）不能使用共享技术的对象，一般不出现在享元工厂中
 * 4、FlyweightFactory——享元工厂：构造池容器，提供从池中获得对象的方法
 * <p>
 * 优点：
 * 减少对象的创建，降低程序内存占用，增强程序性能
 * <p>
 * 缺点：
 * 提高系统复杂度，需要分离出外部状态和内部状态，由于外部状态具有固定特性，不应该随内部状态改变而改变，否则导致系统逻辑混乱
 * <p>
 * 使用场景：
 * 1、系统中存在大量相似对象
 * 2、细粒度的对象都具备接近的外部状态，且内部状态与环境无关
 * 3、需要缓冲池的场景
 * <p>
 * 注意点：
 * 1、在多线程情况下，应该注意线程安全问题
 * 2、外部状态最好以Java基本类型作为标志（String，int等）
 */
public class Client {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            String ex = "Flyweight_" + i + "_object";
            FlyweightFactory.getFlyweight(ex);
        }

        Flyweight flyweight = FlyweightFactory.getFlyweight("Flyweight_1_object");
        flyweight.operate();
    }
}
