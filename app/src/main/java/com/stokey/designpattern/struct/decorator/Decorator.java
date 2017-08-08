package com.stokey.designpattern.struct.decorator;

/**
 * Created by stokey on 2017/8/9.
 */

/**
 * 抽象装饰者
 */
public abstract class Decorator extends Component{
    private Component component = null;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
