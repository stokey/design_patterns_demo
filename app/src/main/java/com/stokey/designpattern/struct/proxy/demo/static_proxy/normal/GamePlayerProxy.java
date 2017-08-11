package com.stokey.designpattern.struct.proxy.demo.static_proxy.normal;

/**
 * Created by stokey on 2017/8/17.
 */

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name){
        try {
            this.gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            System.out.println("GamePlayerProxy init error: " + e.getMessage());
        }
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
}
