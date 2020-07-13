package com;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        String get = HttpUtil.get("www.baidu.com");
//
//        JSONObject couponCode = new JSONObject();
//        for (String str : couponCode.keySet()) {
//            System.out.println(str);
//        }
//        String a="";
//        System.out.println(a.startsWith("2"));
//        System.out.println(DateUtil.formatDate(DateUtil.date(1531970056000L)));
//        System.out.println(new Zero().a==2);
//        System.out.println("2571310021335".substring(4,6).equals("31"));
//        int str = 7;
//        String startCardNumber = str+"";
//        System.out.println(!Arrays.asList(new Integer[]{5,7,8}).contains(str));
//        System.out.println(!startCardNumber.equalsIgnoreCase("5") && !startCardNumber.equalsIgnoreCase("7") && !startCardNumber.equalsIgnoreCase("8"));
//        System.out.println(new HashMap<>().size());

//        String cardsTong = "85090671483";
//        String startCardNumber = cardsTong.substring(0, 1);
//        // 86 开头11位 按正常走
//        boolean isStrWith86 = cardsTong.substring(0, 2).equals("86");
//        // 11位卡 5 7 8 开头为次卡
//        boolean contains_flag = !Arrays.asList(new Integer[]{5, 7, 8}).contains(startCardNumber);
//        if(contains_flag||isStrWith86){
//            if(Arrays.asList(new Integer[]{100, 5100, 3001}).contains("10030")){
//                System.out.println(3001);
//            }else {
//                System.out.println(3001);            }
//        }else {
//            System.out.println(200);        }






        List<String[]> cardList=new ArrayList<>();
        cardList.add(new String[]{"001","001"});
        cardList.add(new String[]{"002","002"});
        cardList.add(new String[]{"003","003"});
        cardList.add(new String[]{"004","004"});


        List<String> cgvInsertSql = createCGVInsertSql(cardList, 2);
        cgvInsertSql.forEach(System.out::println);

    }

    final static int subNum=3;
    public static List<String> createCGVInsertSql(List<String[]> cardList,int type){
        List<String> rs=new ArrayList<>();
        if(cardList.size()>subNum){
            List<String[]> left = cardList.subList(0,subNum);
            List<String[]> right = cardList.subList(subNum, cardList.size());
           rs = createCGVInsertSql(left, type);
           rs.addAll(createCGVInsertSql(right, type));
           return rs;
        }else {
            StringBuilder rsone=new StringBuilder();
            for (int i = 0; i < cardList.size(); i++) {
                String[] strings =  cardList.get(i);
                rsone.append("('"+strings[0]+"','"+strings[1]+"',"+type+")");
                if(i!=(cardList.size()-1)){
                    rsone.append(",");
                }
            }
            rs.add(rsone.toString());
            return rs;
        }
    }

}
