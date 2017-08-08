package com.stokey.designpattern.creator.factory.demo.factory;

import com.stokey.designpattern.creator.factory.demo.client.MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public abstract class AbstractMailFactory {
    public abstract MailClient createMailClient();
}
