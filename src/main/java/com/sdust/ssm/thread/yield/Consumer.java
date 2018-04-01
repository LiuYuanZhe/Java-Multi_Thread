package com.sdust.ssm.thread.yield;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class Consumer implements Runnable{
    Map map = new HashMap();
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("I am consumer : consumer Item "+i);
//            Thread.yield();
        }
    }
}
