package com.stokey.designpattern.creator.builder;

/**
 * Created by tiangen on 2017/8/7.
 */

/**
 * 建造者模式
 * <p>
 * 创建对象较为复杂，有着复杂的组合方式（Builder）
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * <p>
 * 优点：
 * 1. 使客户端不必知道产品内部组成细节
 * 2. 建造者独立，容易扩展
 * 3. 便于控制细节风险
 * <p>
 * 使用场景：
 * 1、相同方法，不同执行顺序，产生不同的事件结果
 * 2、多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不同
 * 3、产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能
 * 4、在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到——柔化创建过程（☹️）
 */

public class Client {
    private Builder mBuilder = new ConreteBuilder();

    // 设置不同的产品
    public Product getAProduct() {
        mBuilder.setPart();
        return mBuilder.builder();
    }
}
