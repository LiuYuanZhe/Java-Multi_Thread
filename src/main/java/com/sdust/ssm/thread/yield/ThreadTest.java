package com.sdust.ssm.thread.yield;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());
        producer.setPriority(Thread.MIN_PRIORITY);
        consumer.setPriority(Thread.MAX_PRIORITY);
        consumer.start();
        producer.start();
    }
}
