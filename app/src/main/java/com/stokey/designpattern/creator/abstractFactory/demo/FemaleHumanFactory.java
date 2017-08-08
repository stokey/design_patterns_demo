package com.stokey.designpattern.creator.abstractFactory.demo;

import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleBlackHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleWhiteHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleYellowHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.Human;

/**
 * Created by stokey on 2017/8/8.
 */

public class FemaleHumanFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
