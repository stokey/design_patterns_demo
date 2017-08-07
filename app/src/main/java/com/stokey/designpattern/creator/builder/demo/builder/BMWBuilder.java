package com.stokey.designpattern.creator.builder.demo.builder;

import com.stokey.designpattern.creator.builder.demo.model.BMWModel;
import com.stokey.designpattern.creator.builder.demo.model.CarModel;

import java.util.ArrayList;

/**
 * Created by tiangen on 2017/8/7.
 */

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel build() {
        return this.bmw;
    }
}
