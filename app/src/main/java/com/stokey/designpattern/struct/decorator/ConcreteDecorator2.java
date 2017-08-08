package com.stokey.designpattern.struct.decorator;

/**
 * Created by stokey on 2017/8/9.
 */

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    // 自定义增加方法
    private void methodLast(){
        System.out.println("ConcreteDecorator1 last method");
    }

    @Override
    public void operate() {
        super.operate();
        this.methodLast();
    }
}
