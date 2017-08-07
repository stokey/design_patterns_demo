package com.stokey.designpattern.creator.builder.demo.builder;

import com.stokey.designpattern.creator.builder.demo.model.BenzModel;
import com.stokey.designpattern.creator.builder.demo.model.CarModel;

import java.util.ArrayList;

/**
 * Created by tiangen on 2017/8/7.
 */

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel build() {
        return this.benz;
    }
}
