package com.sdust.ssm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/3/24.
 */
public class TestVolatile {
    public volatile int inc = 0;
    public void increase(){
        Map map = new HashMap();
        map.put("1",null);
        inc++;
    }
//
//    public static void main(String[] args) {
//        final TestVolatile testVolatile = new TestVolatile();
//        for (int i=0;i<10;i++){
//            new Thread(){
//                public void run(){
//                    for (int j=0;j<1000;j++)
//                        testVolatile.increase();
//                };
//            }.start();
//        }
//        while (Thread.activeCount()>1){
//            Thread.yield();
//        }
//        System.out.println(testVolatile.inc);
//    }
}
