package com.hanzi2pinyin;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.math.BigDecimal.ROUND_CEILING;

public class pinyin2shouzimu_main {
    public static void main(String[] args) throws InterruptedException {


        String[] cinemaName=new String[]{
                      "北京朝阳星典影城（亮马桥四季店）"

        };
        for (String s : cinemaName) {
            System.out.print(s + "       ");
            System.out.println(PinyinDemo.ToFirstChar(s.replace("(", "").replace(")", "").replace(" ", "")));
        }

//        System.out.println("63d4f503-426d-4fc0-8a26-0aebb0ed9072".length());
//        BigDecimal a=new BigDecimal("0.01");
//        BigDecimal bigDecimal = a.setScale(0, ROUND_CEILING);
//        System.out.println(bigDecimal);


//        Date signUpEndTime = new Date(System.currentTimeMillis());
//        Thread.sleep(100);
//        Date now =new Date(System.currentTimeMillis());
//        if(signUpEndTime.before(now)){
//            System.out.println("signUpEndTime zai  now  befor");
//        }
//        String endUseTime = "2019-04-15 00:00:00";
//        Date now = DateUtil.date(System.currentTimeMillis());
//        Date endDate = DateUtil.parse(endUseTime);
//        if(now.after(endDate)){
//            System.out.println("1");
//        }

//        String QRcode="http://m.kangou.cn/2dcode/81010009107fdafe5fc134130c";
//        String QRcode="http://m.kangou.cn/2dcode/a_1001019900004d554bda048854ae";
//        String[] card = QRcode.toLowerCase().split("m.kangou.cn/2dcode/");
////		11位   http://m.kangou.cn/2dcode/81010009107fdafe5fc134130c
////		13位   http://m.kangou.cn/2dcode/a_1001019900004d554bda048854ae
//        String cardNum = card[1].substring(0, 11).trim();
//        if(card[1].startsWith("a_")){
//            cardNum=card[1].substring(2, 15).trim();
//        }
//        System.out.println(cardNum);
//        QRcode.substring(19);
//        System.out.println(QRcode);

//        String aaa="aaaa,";
//        System.out.println(aaa.substring(0,aaa.length()-1));


        List<Long> numbers = Arrays.asList(3L, 2L, 2L, 3L, 7L, 3L, 5L);
//        LongSummaryStatistics stats = numbers.stream().mapToLong((x) -> x).summaryStatistics();
//        System.out.println("列表中最大的数 : " + stats.getMax());
//        System.out.println("列表中最小的数 : " + stats.getMin());
//        System.out.println("所有数之和 : " + stats.getSum());
//        System.out.println("平均数 : " + stats.getAverage());
//        System.out.println("count : " + numbers.stream().mapToLong((x) -> {
//            try {
//                if(x==2L){
//                    throw  new RuntimeException("2333");
//                }
//            }catch (RuntimeException e){
//                return 0L;
//            }
//
//            return x;
//        }).summaryStatistics().getSum());

    }
}
