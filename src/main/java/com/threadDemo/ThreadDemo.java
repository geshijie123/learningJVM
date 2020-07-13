package com.threadDemo;

import com.sun.deploy.net.proxy.ProxyUnavailableException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadDemo {
   static class Thread1 extends Thread {
       @Override
       public void run() {

           System.out.println("233");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }

   static class Thread2 implements Runnable{
       @Override
       public void run() {
           System.out.println("666");
       }
   }

    public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {


//        new Thread1().start();
//        new Thread(new Thread2()).start();


//        Thread1 thread1 = new Thread1();
//        thread1.start();
//
//
//        thread1.join();
//
//        System.out.println("main");

//
//        List<String> strings = Arrays.asList("11","22","33");
//
//        List<String> otherPays = strings.stream().filter(one -> one.equals("44")).collect(Collectors.toList());
//
//        System.out.println(otherPays.size());



        String param="aaabbbccc";

        String s = Base64.getEncoder().encodeToString(param.getBytes("UTF-8"));

        System.out.println(s);

        byte[] decode = Base64.getDecoder().decode(s);
        System.out.println(new String(decode,"UTF-8"));




       /* final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        final String text = "字串文字";
        final byte[] textByte = text.getBytes("UTF-8");
//编码
        final String encodedText = encoder.encodeToString(textByte);
        System.out.println(encodedText);
//解码
        System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
*/
/*        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        final String text = "字串文字";
        final byte[] textByte = text.getBytes("UTF-8");
//编码
        final String encodedText = encoder.encodeToString(textByte);
        System.out.println(encodedText);
//解码
        System.out.println(new String(decoder.decode(encodedText), "UTF-8"));*/




/*
        final BASE64Encoder encoder = new BASE64Encoder();
        final BASE64Decoder decoder = new BASE64Decoder();
        final String text = "字串文字";
        final byte[] textByte = text.getBytes("UTF-8");
//编码
        final String encodedText = encoder.encode(textByte);
        System.out.println(encodedText);
//解码
        System.out.println(new String(decoder.decodeBuffer(encodedText), "UTF-8"));

//        final BASE64Encoder encoder = new BASE64Encoder();
//        final BASE64Decoder decoder = new BASE64Decoder();
//        final String text = "字串文字";
//        final byte[] textByte = text.getBytes("UTF-8");
////编码
//        final String encodedText = encoder.encode(textByte);
//        System.out.println(encodedText);
//
////解码
//        System.out.println(new String(decoder.decodeBuffer(encodedText), "UTF-8"));*/
    }
}
