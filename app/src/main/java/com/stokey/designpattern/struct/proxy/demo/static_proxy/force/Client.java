package com.stokey.designpattern.struct.proxy.demo.static_proxy.force;

/**
 * Created by stokey on 2017/8/17.
 */

import java.util.Date;

/**
 * 强制代理：只能通过真实对象访问代理对象
 */
public class Client {
    public static void main(String[] args){
        // 定义游戏角色
        IGamePlayer player = new GamePlayer("Stokey");
        IGamePlayer proxy = new GamePlayerProxy(player);
        // 开始时间
        System.out.println("开始时间："+ new Date().toGMTString());

        proxy.login("Stokey@gmail.com","password123");
        proxy.upgrade();

        // 结束时间
        System.out.println("结束时间："+ new Date().toGMTString());

        System.out.println("------------------------");
        System.out.println("************************");
        System.out.println("------------------------");

        // 强制代理调用场景
        // 定义游戏角色
        IGamePlayer playerForce = new GamePlayer("Stokey");
        IGamePlayer proxyForce = playerForce.getProxy();
        // 开始时间
        System.out.println("开始时间："+ new Date().toGMTString());

        proxyForce.login("Stokey@gmail.com","password123");
        proxyForce.killBoss();
        proxyForce.upgrade();

        // 结束时间
        System.out.println("结束时间："+ new Date().toGMTString());
    }
}
