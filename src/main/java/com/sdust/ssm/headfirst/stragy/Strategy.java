package com.sdust.ssm.headfirst.stragy;

/**
 * Created by LiuYuanZhe on 18/3/24.
 */
public class Strategy {
    public static void strategic(Shape shape){
        shape.output();
    }

    public static void main(String[] args) {
        strategic(new Circle());
        strategic(new Square());
    }
}
