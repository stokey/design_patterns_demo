package com.stokey.designpattern.creator.factory.demo.factory;

import com.stokey.designpattern.creator.factory.demo.client.IMAPMailClient;
import com.stokey.designpattern.creator.factory.demo.client.MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public class IMAPMailFactory extends AbstractMailFactory {
    @Override
    public MailClient createMailClient() {
        IMAPMailClient client = new IMAPMailClient();
        client.setUserName("IMAP Mail Client");
        client.setPassword("87654321");
        return client;
    }
}
