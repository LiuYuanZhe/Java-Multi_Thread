package com.sdust.ssm.test;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import sun.applet.Main;

import java.util.*;

/**
 * Created by LiuYuanZhe on 18/3/14.
 */
public class Test{
    /*public static void main(String[] args) {
        int i = 0;
        int s = 0;
        while (i<=100){
            int x = i%10;
            int y = i/10%10;
            int z = i/100;
            if (i%7==0||x==7||y==7||z==7){
                s+=i;
            }
            i++;
        }
        System.out.println(s);
    }*/

    /*public static int strNum(String x,String y)
    {
        int num = 0;
        int size = x.length();
        for(int i=0;i<size;i++)
        {
            if(x.charAt(i)!=y.charAt(i)) num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int size1 = S.length();
        int size2 = T.length();
        int sum = 0;
        int count = size1-size2;
        for(int i = 0;i<=count;i++)
        {
            String t = S.substring(i,i+size2);
            System.out.println(t);
            sum+=strNum(t,T);
        }
        System.out.println(sum);
    }*/

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String number = sc.next();
//        int size = number.length();
//        int num[] = new int[size];
//        String stringArray[] = number.split("");
//        for (int i = 0;i<size;i++)
//        {
//            num[i] = Integer.parseInt(stringArray[i]);
//        }
//        Arrays.sort(num);
//        for(int i = 0;i<size;i++)
//        {
//
//        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List  list = new ArrayList(1000000000);
        int d[] = new int[20];
        for (int i = 0;i<s.length();++i){
            ++d[s.charAt(i)-'0'];
        }
        int minp = 0;
        for (int i = 9;i>0;--i){
            if (d[i] <= d[minp]){
                minp = i;
            }
        }
        if (minp == 0){
            System.out.print("1");
            for (int i = 0;i<d[minp];++i)
                System.out.print("0");
        }else {
            for (int i = 0;i <= d[minp];++i){
                System.out.println(minp);
            }
        }
    }
}