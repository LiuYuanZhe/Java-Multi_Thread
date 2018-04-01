package com.sdust.ssm.utils;

/**
 * Created by LiuYuanZhe on 18/3/30.
 */
public class ThreadUtils {
    public static void sleep(int times){
        try {
            Thread.sleep(times);
        }catch (InterruptedException e){
//            e.printStackTrace();
            System.out.println();
        }

    }
}
