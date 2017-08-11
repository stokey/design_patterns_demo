package com.stokey.designpattern.struct.proxy.demo.static_proxy.force;


/**
 * Created by stokey on 2017/8/17.
 */

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String psw) {
        this.gamePlayer.login(user,psw);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
