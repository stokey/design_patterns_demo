package com.stokey.designpattern.creator.prototype;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 广告模板类
 */
public class AdvTemplate {
    // 广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    // 广告信内容
    private String advContext = "国庆抽奖活动：xxx";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
