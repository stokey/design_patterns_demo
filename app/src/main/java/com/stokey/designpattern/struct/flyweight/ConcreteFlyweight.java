package com.stokey.designpattern.struct.flyweight;

/**
 * Created by stokey on 2017/8/11.
 */

public class ConcreteFlyweight extends Flyweight {
    // 接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyweight operate");
    }
}
