package com.stokey.designpattern.struct.proxy.demo.static_proxy.force;

/**
 * Created by stokey on 2017/8/17.
 */

public class GamePlayer implements IGamePlayer {
    private String name = "";
    // 代理对象
    private IGamePlayer proxy = null;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String psw) {
        if (this.isProxy()){
            System.out.println("User name: " + user+ ", password: " + psw);
        } else {
            System.out.println("Please set the Proxy");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()){
            System.out.println("killBoss");
        } else {
            System.out.println("Please set the Proxy");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println("upgrade");
        } else {
            System.out.println("Please set the Proxy");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 检验是否代理访问
     * @return
     */
    private boolean isProxy(){
        return this.proxy != null;
    }
}
