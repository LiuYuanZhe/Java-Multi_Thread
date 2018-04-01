package com.sdust.ssm.thread.synchrnized;

/**
 * Created by LiuYuanZhe on 18/3/31.
 */
public class Thread1 implements Runnable {
    Object lock;
    @Override
    public void run() {
        synchronized (lock){
            for (int i = 0;i<100;i++){
                System.out.println("thread1: lock 实例"+i);
            }
        }
    }
}
