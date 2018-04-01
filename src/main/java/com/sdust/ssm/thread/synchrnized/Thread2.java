package com.sdust.ssm.thread.synchrnized;

/**
 * Created by LiuYuanZhe on 18/3/31.
 */
public class Thread2 implements Runnable {
    @Override
    public synchronized void run() {
        for (int i=0;i<100;i++){
            System.out.println("thread2: 实例"+i);
        }
    }
}
