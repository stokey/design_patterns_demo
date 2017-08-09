package com.stokey.designpattern.struct.brigde;

/**
 * Created by tiangen on 2017/8/9.
 */

/**
 * 具体抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    // 修正父类的行为
    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
