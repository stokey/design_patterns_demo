package com.stokey.designpattern.struct.proxy;

/**
 * Created by tiangen on 2017/8/11.
 */

/**
 * 代理模式 —— （通过代理找到真实角色）
 * （状态模式／策略模式／访问者模式——特殊的代理模式）
 * 为其他对象提供一种代理以控制对这个对象的访问
 * <p>
 * 构成：
 * 1、Subject——抽象主题角色
 * 2、RealSubject——具体主题角色
 * 3、Proxy——代理主题角色
 * <p>
 * 优点：
 * 1、职责清晰：真实角色只负责实现实际业务逻辑
 * 2、高扩展性
 * 3、智能化
 * <p>
 * 使用场景：
 * 解耦，减弱调用者对对象类的强入侵性。
 * <p>
 * 分类：
 * 1、静态代理
 *  1、普通代理：调用者需要设置被代理对象，调用者必须知道代理的存在
 *  2、强制代理：调用者必须通过真实角色找到代理角色，否则不能访问
 * ——高层模块new一个真实对象，返回的却是代理角色。【代理的管理和创建由真实角色完成】
 * 2、动态代理：实现阶段不关心代理对象，直到运行阶段才会指定代理对象
 *  1、实现InvocationHandler接口
 *  2、Proxy.newInstance()
 * <p>
 * AOP框架核心名词：
 * 1、切面（Aspect）
 * 2、切入点（JoinPoint）
 * 3、通知（Advice）
 * 4、织入（Weave）
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
