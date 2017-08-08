package com.stokey.designpattern.struct.decorator;

/**
 * Created by stokey on 2017/8/9.
 */

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
