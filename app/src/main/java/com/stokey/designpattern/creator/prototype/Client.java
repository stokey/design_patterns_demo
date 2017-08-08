package com.stokey.designpattern.creator.prototype;

/**
 * Created by stokey on 2017/8/8.
 */

import java.util.Random;

/**
 * 原型模式：短时间，创建大量对象(Clone——实现Cloneable接口)
 * <p>
 * 通过拷贝原型创建出新的对象（大量共有信息类）
 */
public class Client {
    // 发送账单的数量
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        Random random = new Random();
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation("xx_" + random.nextInt() + " 先生（女士）");
            cloneMail.setReceiver("yy_" + random.nextInt() + "@163.com");
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("SendMail:" + mail.toString());
    }
}
