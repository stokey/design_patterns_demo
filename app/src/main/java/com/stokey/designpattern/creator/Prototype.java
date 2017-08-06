package com.stokey.designpattern.creator;

/**
 * Created by stokey on 2017/8/5.
 */

import java.util.Random;

/**
 * 原型模式：短时间，创建大量对象(Clone——实现Cloneable接口)
 * <p>
 * 通过拷贝原型创建出新的对象（大量共有信息类）
 */
public class Prototype {

    /**
     * 广告模板类
     */
    static class AdvTemplate {
        // 广告信名称
        private String advSubject = "XX银行国庆信用卡抽奖活动";
        // 广告信内容
        private String advContext = "国庆抽奖活动：xxx";

        public String getAdvSubject() {
            return advSubject;
        }

        public void setAdvSubject(String advSubject) {
            this.advSubject = advSubject;
        }

        public String getAdvContext() {
            return advContext;
        }

        public void setAdvContext(String advContext) {
            this.advContext = advContext;
        }
    }

    /**
     * 邮件信息类
     */
    static class Mail implements Cloneable {
        // 邮件接收人
        private String receiver;
        // 邮件名称
        private String subject;
        // 邮件称谓
        private String appellation;
        // 邮件内容
        private String context;
        // 邮件签名
        private String tail;

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getAppellation() {
            return appellation;
        }

        public void setAppellation(String appellation) {
            this.appellation = appellation;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getTail() {
            return tail;
        }

        public void setTail(String tail) {
            this.tail = tail;
        }

        public Mail(AdvTemplate template) {
            this.context = template.getAdvContext();
            this.subject = template.getAdvSubject();
        }

        @Override
        protected Mail clone() {
            Mail mail = null;
            try {
                mail = (Mail) super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Mail clone error: " + e.getMessage());
                e.printStackTrace();
            }
            return mail;
        }

        @Override
        public String toString() {
            return this.receiver + ":" + this.subject;
        }
    }

    /**
     * 场景类
     */
    static class Client {
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
}
