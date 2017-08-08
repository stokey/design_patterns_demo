package com.stokey.designpattern.creator.factory.demo.client;

/**
 * Created by tiangen on 2017/8/8.
 */

public class HTTPMailClient extends MailClient {
    @Override
    public void connect() {
        if (this.userName == null || this.password == null) {
            System.out.println("HTTPMailClient can not connect");
        } else {
            System.out.println("HTTPMailClient is connecting");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("HTTPMailClient is disconnecting");
    }
}
