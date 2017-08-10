package com.stokey.designpattern.struct.composite;

/**
 * Created by tiangen on 2017/8/10.
 */

/**
 * 树叶构件——定义参加组合的原始对象行为
 */
public class Leaf extends Component {
    @Override
    public void doSomething() {
        // 覆写父类方法
        System.out.println("Leaf Component doing something");
    }
}
