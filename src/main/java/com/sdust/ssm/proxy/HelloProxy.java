package com.sdust.ssm.proxy;

/**
 * Created by LiuYuanZhe on 18/3/27.
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy(){
        hello = new HelloImpl();
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }

    @Override
    public void sayhello(String name) {
        before();
        hello.sayhello(name);
        after();
    }

    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.sayhello("liuyuanzhe");
    }
}
