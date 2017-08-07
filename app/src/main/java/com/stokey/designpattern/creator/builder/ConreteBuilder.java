package com.stokey.designpattern.creator.builder;


/**
 * Created by tiangen on 2017/8/7.
 */

public class ConreteBuilder extends Builder {
    private Product mProduct = new Product();
    @Override
    public void setPart() {
        // 对Product进行设置
    }

    @Override
    public Product builder() {
        return mProduct;
    }
}
