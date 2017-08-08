package com.stokey.designpattern.creator.prototype;

/**
 * Created by stokey on 2017/8/8.
 */

/**
 * 邮件信息类
 */

public class Mail implements Cloneable {
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
