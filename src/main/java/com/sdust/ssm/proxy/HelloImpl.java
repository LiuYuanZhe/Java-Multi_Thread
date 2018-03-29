package com.sdust.ssm.proxy;

/**
 * Created by LiuYuanZhe on 18/3/27.
 */
public class HelloImpl implements Hello {
    @Override
    public void sayhello(String name) {
        System.out.println("Hello,"+name);
    }
}
