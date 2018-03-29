package com.sdust.ssm.thread.yield;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class Producer implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("I am producer : producer Item "+i);
//            Thread.yield();
        }
    }
}
