package com.stokey.designpattern.creator.factory.demo.factory;

import com.stokey.designpattern.creator.factory.demo.client.HTTPMailClient;
import com.stokey.designpattern.creator.factory.demo.client.MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public class HTTPMailFactory extends AbstractMailFactory {
    @Override
    public MailClient createMailClient() {
        HTTPMailClient client = new HTTPMailClient();
        client.setUserName("HTTP Mail Client");
        client.setPassword("12345678");
        return client;
    }
}
