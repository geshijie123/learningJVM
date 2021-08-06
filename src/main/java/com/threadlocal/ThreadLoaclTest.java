package com.threadlocal;

import com.sun.javafx.fxml.expression.KeyPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadLoaclTest {




    public static void main(String[] args) {

        ThreadLoaclTest threadLoaclTest = new ThreadLoaclTest();
        new Thread(()->{threadLoaclTest.fun1();}).start();
        new Thread(()->{threadLoaclTest.fun1();}).start();
        new Thread(()->{threadLoaclTest.fun1();}).start();
        new Thread(()->{threadLoaclTest.fun1();}).start();



        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    private void fun1(){
        IntStream.range(0,1000).parallel().forEach(intone->{
            String one=intone+"";

            if(sendedList.contains(one)){
                return;
            }

            if(isSending(one)){
                return;
            }

            try {
                Thread.sleep(100);
                sendedList.add(one);
                System.out.println(one);

                rmSending(one);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

        System.out.println("sendedList "+sendedList.size());
        System.out.println("senddinglist "+senddinglist.size());
    }



    private static List<String> sendedList = Collections.synchronizedList(new ArrayList<>());
    private static List<String> senddinglist = Collections.synchronizedList(new ArrayList<>());
    private static synchronized boolean isSending(String a){
        if(senddinglist.contains(a+"")){
            System.err.println("-"+a);
            return true;
        }
        senddinglist.add(a);
        return  false;
    }
    private static synchronized void rmSending(String a){
        senddinglist.remove(a);
    }
}
