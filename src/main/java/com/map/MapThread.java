package com.map;

import cn.hutool.core.util.RandomUtil;
import lombok.Data;

import java.util.*;

public class MapThread {
    public static void main(String[] args) {

//        Map<String,Integer> map = new HashMap<>();
//        map.put("a",0);
//        map.put("b",0);
//        map.put("c",0);
//        map.put("d",0);
//        List<Integer> array=new ArrayList<>();
//        for (int i=0;i<10000;i++){
//            array.add(i);
//        }
//        System.out.println( array.toString());
//        array.forEach(one->{
//            String i = RandomUtil.randomEle(Arrays.asList("a","b","c","d"));
//            Integer integer = map.get(i);
//            map.put(i,++integer);
//        });
//        map.entrySet().forEach(one->{
//            System.out.println(one.getValue());
//        });


        String a = "233";
        Demo01 demo01 = new Demo01();
        demo01.setB(a);
        a="666";
        System.out.println(a + demo01.getB());


    }



}
@Data
class Demo01{
    private int a;
    private String b;
}