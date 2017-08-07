package com.stokey.designpattern.creator.builder.demo.model;

/**
 * Created by tiangen on 2017/8/7.
 */

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz prepare start ...");
    }

    @Override
    protected void stop() {
        System.out.println("Benz is stopping ...");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz is alarming ...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engine is booming ...");
    }
}
