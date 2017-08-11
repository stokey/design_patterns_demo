package com.stokey.designpattern.struct.proxy;

/**
 * Created by tiangen on 2017/8/11.
 */

/**
 * 代理模式
 *  （状态模式／策略模式／访问者模式——特殊的代理模式）
 * 为其他对象提供一种代理以控制对这个对象的访问
 *
 * 构成：
 * 1、Subject——抽象主题角色
 * 2、RealSubject——具体主题角色
 * 3、Proxy——代理主题角色
 *
 * 优点：
 * 1、职责清晰：真实角色只负责实现实际业务逻辑
 * 2、高扩展性
 * 3、智能化
 *
 * 使用场景：
 * 解耦，减弱调用者对对象类的强入侵性。
 *
 * 分类：
 * 1、普通代理：调用者需要设置代理服务器，调用者必须知道代理的存在
 * 2、透明代理：调用者不用设置代理服务器，可以直接使用
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
