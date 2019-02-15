package com.jvm.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * StackOverflowError
 * -XX:PermSize=1M -XX:MaxPermSize=1M
 */
public class OOM {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(1);
        add(list,"A");
    }
    private synchronized static List<String> add(List<String> list, String str){
        System.out.println(str.length());
        list.add(str);
        add(list,str+"X");
        return list;
    }
}
