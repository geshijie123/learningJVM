package com.正则;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class 正则替换 {

    final  static Pattern pattern = Pattern.compile("[1-9]\\d*元");

    final static Pattern pattern1 = Pattern.compile("\\(+.+\\)");

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();

        AtomicReference<String> a = new AtomicReference<>("早鸟VIP票150元   普通票168元(员工特供)");



        // 创建 Pattern 对象

        // 现在创建 matcher 对象
        Matcher matcher = pattern.matcher(a.get());
        while (matcher.find()){
            map.put(matcher.group(0),MoneyReplace(matcher.group(0)));
        }
        Matcher matcher1 = pattern1.matcher(a.get());
        while (matcher1.find()){
            map.put(matcher1.group(0),"");
        }

        map.entrySet().forEach(one->{
            a.set(a.get().replace(one.getKey(), one.getValue()));
        });




        System.out.println(a.get());
    }

    private static String MoneyReplace(String group) {
        String money = group.split("元")[0];
        return  (Integer.valueOf(money)*1.5 )+"点";
    }


}
