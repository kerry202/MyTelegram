package org.telegram;

/**
 * Created by yangbo on 2018/3/6
 */

public class Logs {

    public static boolean isdug =true;

    public static void s(String s){
        if (isdug){
            System.out.println(" 测试1######### "+s);
        }

    }

    public static void d(String s,String s1){
        if (isdug){
            System.out.println(" 测试2#########  "+" #####类名#####   "+s+"   ####消息####  "+s1);
        }

    }
}
