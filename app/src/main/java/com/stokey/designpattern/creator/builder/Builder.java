package com.stokey.designpattern.creator.builder;

/**
 * Created by stokey on 2017/8/5.
 */

/**
 * 抽象建造者类
 */
abstract class Builder {
    public abstract void setPart();
    public abstract Product builder();
}
