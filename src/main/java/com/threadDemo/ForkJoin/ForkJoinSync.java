package com.threadDemo.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;


/**
 * RecursiveTask  又返回值
 * RecursiveAction 无返回值
 * 都继承了 ForkJoinTask
 */
public class ForkJoinSync extends RecursiveTask<String> {

    private String str;

    ForkJoinSync(String str){
        this.str=str;
    }

    @Override
    protected String compute() {
        if(str.length()<=1000){
            StringBuilder rs=new StringBuilder();
            for (int i=0;i<str.length();i++){
                rs.append(str.charAt(i));
                rs.append(str.charAt(i));
            }
            return rs.toString();
        }else {
            String left = str.substring(0, 1000);
            String right = str.substring(1000, str.length());
            ForkJoinSync forkLeft = new ForkJoinSync(left);
            ForkJoinSync forkreght = new ForkJoinSync(right);

            invokeAll(forkLeft,forkreght);

            return forkLeft.join()+forkreght.join();

        }
    }



    public static void main(String[] args) {
        String str="asdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklqasdfghjklq";
        //分而治之  同步！同步！同步！同步！同步！  用法方法  有返回值结果
        //创建使用 forkjoin框架思想的 线程池
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        //实现自定义的
        ForkJoinSync forkJoinDemo=new ForkJoinSync(str);
        forkJoinPool.invoke(forkJoinDemo);
        String join = forkJoinDemo.join();
        System.out.println("rs: "+join);
    }
}