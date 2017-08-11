package com.stokey.designpattern.struct.proxy.demo.static_proxy.force;

/**
 * Created by stokey on 2017/8/17.
 */

/**
 * 强制代理的接口类
 */
public interface IGamePlayer {
    void login(String user,String psw);
    void killBoss();
    void upgrade();
    IGamePlayer getProxy();
}
