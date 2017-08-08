package com.stokey.designpattern.creator.factory.demo.factory;

import com.stokey.designpattern.creator.factory.demo.client.MailClient;
import com.stokey.designpattern.creator.factory.demo.client.POP3MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public class POP3MailFactory extends AbstractMailFactory {
    @Override
    public MailClient createMailClient() {
        POP3MailClient client = new POP3MailClient();
        client.setUserName("POP3 Mail Client");
        client.setPassword("1233211234567");
        return client;
    }
}
