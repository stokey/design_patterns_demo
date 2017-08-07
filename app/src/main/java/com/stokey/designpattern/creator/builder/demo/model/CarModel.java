package com.stokey.designpattern.creator.builder.demo.model;

import java.util.ArrayList;

/**
 * Created by tiangen on 2017/8/7.
 */

/**
 * 汽车模型抽象类
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run(){
        for(int i=0;i<sequence.size();i++){
            String actionName = sequence.get(i);
            switch (actionName.toLowerCase()){
                case "start":{
                    this.start();
                    break;
                }
                case "stop":{
                    this.stop();
                    break;
                }
                case "alarm":{
                    this.alarm();
                    break;
                }
                case "engineBoom":{
                    this.engineBoom();
                    break;
                }
                default:{
                    System.out.println("unknown action");
                    break;
                }
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
