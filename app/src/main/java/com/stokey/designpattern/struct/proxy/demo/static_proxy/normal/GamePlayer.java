package com.stokey.designpattern.struct.proxy.demo.static_proxy.normal;

/**
 * Created by stokey on 2017/8/17.
 */

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(IGamePlayer player, String name) throws Exception {
        if (player == null) {
            throw new Exception("Can not create null object");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String psw) {
        System.out.println(this.name + " is login! password is: " + psw);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " is killing boss!");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " is upgrading!");
    }
}
