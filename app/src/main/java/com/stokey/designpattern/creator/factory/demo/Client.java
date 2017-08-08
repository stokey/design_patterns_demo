package com.stokey.designpattern.creator.factory.demo;

import com.stokey.designpattern.creator.factory.demo.client.HTTPMailClient;
import com.stokey.designpattern.creator.factory.demo.client.MailClient;
import com.stokey.designpattern.creator.factory.demo.factory.ConcreteMailFactory;
import com.stokey.designpattern.creator.factory.demo.factory.HTTPMailFactory;
import com.stokey.designpattern.creator.factory.demo.factory.MailFactory;

/**
 * Created by tiangen on 2017/8/8.
 */

public class Client {
    public static void main(String[] args){
        MailFactory factory = new ConcreteMailFactory();
        MailClient client = factory.createMailClient(HTTPMailClient.class);
        client.setPassword("12345678");
        client.setUserName("Stokey HTTP MailClient");
        client.connect();

        // 多工厂模式
        HTTPMailFactory factory1 = new HTTPMailFactory();
        MailClient client1 = factory1.createMailClient();
        client1.disconnect();
    }
}
