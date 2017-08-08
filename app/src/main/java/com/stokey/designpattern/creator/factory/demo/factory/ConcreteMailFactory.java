package com.stokey.designpattern.creator.factory.demo.factory;


import com.stokey.designpattern.creator.factory.demo.client.MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public class ConcreteMailFactory extends MailFactory {
    @Override
    public <T extends MailClient> T createMailClient(Class<T> c) {
        MailClient operator = null;
        try {
            operator = (MailClient) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)operator;
    }
}
