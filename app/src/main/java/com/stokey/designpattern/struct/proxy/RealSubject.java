package com.stokey.designpattern.struct.proxy;

/**
 * Created by tiangen on 2017/8/11.
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}
