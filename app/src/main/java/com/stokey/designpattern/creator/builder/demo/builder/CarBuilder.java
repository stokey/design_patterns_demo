package com.stokey.designpattern.creator.builder.demo.builder;

import com.stokey.designpattern.creator.builder.demo.model.CarModel;

import java.util.ArrayList;

/**
 * Created by tiangen on 2017/8/7.
 */

public abstract class CarBuilder {
    public abstract void setSequence (ArrayList<String> sequence);
    public abstract CarModel build();
}
