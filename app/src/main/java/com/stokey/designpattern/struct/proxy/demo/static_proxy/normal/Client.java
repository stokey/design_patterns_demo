package com.stokey.designpattern.struct.proxy.demo.static_proxy.normal;

/**
 * Created by stokey on 2017/8/17.
 */

import java.util.Date;

/**
 * 普通代理
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("Stokey");
        // 开始时间
        System.out.println("开始时间：" + new Date().toGMTString());

        proxy.login("Stokey@gmail.com", "password123");
        proxy.upgrade();

        // 结束时间
        System.out.println("结束时间：" + new Date().toGMTString());
    }
}
