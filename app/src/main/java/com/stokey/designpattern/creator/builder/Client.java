package com.stokey.designpattern.creator.builder;

/**
 * Created by tiangen on 2017/8/7.
 */

/**
 * 场景类
 */
public class Client {
    private Builder mBuilder = new ConreteBuilder();

    // 设置不同的产品
    public Product getAProduct(){
        mBuilder.setPart();
        return mBuilder.builder();
    }
}
