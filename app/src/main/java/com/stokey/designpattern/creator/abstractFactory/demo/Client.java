package com.stokey.designpattern.creator.abstractFactory.demo;

import com.stokey.designpattern.creator.abstractFactory.demo.product.Human;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 容易扩展等级，不容易扩展产品族
 * 容易扩展性别，不容易扩展人种
 */
public class Client {
    public static void main(String[] args){
        HumanFactory femaleFactory = new FemaleHumanFactory();
        HumanFactory maleFactory = new MaleHumanFactory();

        Human maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.talk();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.getColor();
    }
}
