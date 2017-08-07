package com.stokey.designpattern.creator.builder.demo.model;

/**
 * Created by tiangen on 2017/8/7.
 */

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW prepare start ...");
    }

    @Override
    protected void stop() {
        System.out.println("BMW is stopping ...");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW is alarming ...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engine is booming ...");
    }
}
