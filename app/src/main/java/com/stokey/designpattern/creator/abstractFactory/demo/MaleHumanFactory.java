package com.stokey.designpattern.creator.abstractFactory.demo;

import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleBlackHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleWhiteHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.FemaleYellowHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.Human;
import com.stokey.designpattern.creator.abstractFactory.demo.product.MaleBlackHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.MaleWhiteHuman;
import com.stokey.designpattern.creator.abstractFactory.demo.product.MaleYellowHuman;

/**
 * Created by stokey on 2017/8/8.
 */

public class MaleHumanFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
