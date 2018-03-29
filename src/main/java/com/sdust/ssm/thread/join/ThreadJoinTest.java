package com.sdust.ssm.thread.join;

/**
 * Created by LiuYuanZhe on 18/3/29.
 */
public class ThreadJoinTest implements Runnable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThreadJoinTest(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            System.out.println(this.getName()+ ":" +i);
        }
    }
}
