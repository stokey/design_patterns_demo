package com.stokey.designpattern.creator.factory.demo.factory;

import com.stokey.designpattern.creator.factory.demo.client.MailClient;

/**
 * Created by tiangen on 2017/8/8.
 */

public abstract class MailFactory {
    // 可通过String type创建不同对象
    public abstract <T extends MailClient> T createMailClient(Class<T> c);
}
