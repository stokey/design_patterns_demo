package com.stokey.designpattern.creator.abstractFactory.demo;

import com.stokey.designpattern.creator.abstractFactory.demo.product.Human;

/**
 * Created by stokey on 2017/8/8.
 */

public interface HumanFactory {
    Human createWhiteHuman();
    Human createBlackHuman();
    Human createYellowHuman();
}
