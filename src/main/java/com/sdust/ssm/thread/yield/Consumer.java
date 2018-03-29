package com.sdust.ssm.thread.yield;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class Consumer implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("I am consumer : consumer Item "+i);
//            Thread.yield();
        }
    }
}
