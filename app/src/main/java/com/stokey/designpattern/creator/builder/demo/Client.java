package com.stokey.designpattern.creator.builder.demo;

import com.stokey.designpattern.creator.builder.demo.builder.BMWBuilder;
import com.stokey.designpattern.creator.builder.demo.builder.BenzBuilder;
import com.stokey.designpattern.creator.builder.demo.model.BMWModel;
import com.stokey.designpattern.creator.builder.demo.model.BenzModel;

import java.util.ArrayList;

/**
 * Created by tiangen on 2017/8/7.
 */

public class Client {
    public static void main(String[] args){
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.build();
        benzModel.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.build();
        bmwModel.run();
    }
}
