package com.stokey.designpattern.struct.proxy;

/**
 * Created by tiangen on 2017/8/11.
 */

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    private void before(){
        System.out.println("Proxy before");
    }

    // 善后处理
    private void after(){
        System.out.println("Proxy after");
    }
}
