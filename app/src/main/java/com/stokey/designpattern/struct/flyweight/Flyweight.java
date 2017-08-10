package com.stokey.designpattern.struct.flyweight;

/**
 * Created by stokey on 2017/8/11.
 */

/**
 * 抽象享元角色
 */
public abstract class Flyweight {
    // 内部状态
    private String  intrinsic;
    // 外部状态 —— final 防止被外部修改
    protected final String Extrinsic;
    // 要求享元角色必须接受外部状态
    public Flyweight(String extrinsic){
        this.Extrinsic = extrinsic;
    }

    public abstract void operate();


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
