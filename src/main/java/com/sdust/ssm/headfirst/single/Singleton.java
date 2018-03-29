package com.sdust.ssm.headfirst.single;

/**
 * Created by LiuYuanZhe on 18/3/24.
 * 线程安全
 */
public class Singleton {
    private static class Holder{
        private static Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
