package com.sdust.ssm.thread.join;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class JoinTest {
    public static void main(String[] args) throws Exception {
        ThreadJoinTest t1 = new ThreadJoinTest("小明");
        ThreadJoinTest t2 = new ThreadJoinTest("大张");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
//        thread1.join();
        thread1.start();
        thread1.join(1);
        thread2.start();
    }
}
