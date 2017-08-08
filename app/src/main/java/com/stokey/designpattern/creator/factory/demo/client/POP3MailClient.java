package com.stokey.designpattern.creator.factory.demo.client;

/**
 * Created by tiangen on 2017/8/8.
 */

public class POP3MailClient extends MailClient {
    @Override
    public void connect() {
        if (this.userName == null || this.password == null) {
            System.out.println("POP3MailClient can not connect");
        } else {
            System.out.println("POP3MailClient is connecting");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("POP3MailClient is disconnecting");
    }
}
