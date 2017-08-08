package com.stokey.designpattern.creator.factory.demo.client;

/**
 * Created by tiangen on 2017/8/8.
 */

/**
 * 邮件操作接口
 */
public abstract class MailClient {
    public String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String password;
    public abstract void connect();
    public abstract void disconnect();
}
