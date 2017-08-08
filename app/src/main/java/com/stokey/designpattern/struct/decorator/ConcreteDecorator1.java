package com.stokey.designpattern.struct.decorator;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 具体的装饰类
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义添加的方法
    private void methodPre(){
        System.out.println("ConcreteDecorator1 preview method");
    }

    @Override
    public void operate() {
        this.methodPre();
        super.operate();
    }
}
