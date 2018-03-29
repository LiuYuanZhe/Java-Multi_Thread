package com.sdust.ssm.headfirst.single;

/**
 * Created by LiuYuanZhe on 18/3/24.
 */
public class SingletonAnother {
    private static volatile SingletonAnother Instance;

    private SingletonAnother(){}

    public static SingletonAnother getInstance(){
        if (Instance==null){
            synchronized (SingletonAnother.class){
                if (Instance==null)
                    Instance = new SingletonAnother();
            }
        }
        return Instance;
    }
}
