package com.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  <dependency>
 *             <groupId>com.alibaba</groupId>
 *             <artifactId>easyexcel</artifactId>
 *             <version>2.2.3</version>
 *         </dependency>
 */
public class ExcelOut {
    public static void main(String[] args) {
        String fileName =  "B:/noModelWrite" + System.currentTimeMillis() + ".xlsx";


        List<List<String>> head = map().get(0).keySet().stream().map(one -> new ArrayList<String>(){{add(one);}}).collect(Collectors.toList());
        List<List<Object>> body = map().stream().map(one -> new ArrayList<Object>(){{addAll(one.values());}}).collect(Collectors.toList());

        ExcelWriter excelWriter = EasyExcel.write(fileName).head(head).build();
        WriteSheet writeSheet = EasyExcel.writerSheet(1,"订单信息").head(head).build();
        excelWriter.write(body,writeSheet);

        List<List<String>> head1 = map1().get(0).keySet().stream().map(one -> new ArrayList<String>(){{add(one);}}).collect(Collectors.toList());
        List<List<Object>> body1 = map1().stream().map(one -> new ArrayList<Object>(){{addAll(one.values());}}).collect(Collectors.toList());
        WriteSheet writeSheet1 = EasyExcel.writerSheet(2,"支付信息").head(head1).build();
        excelWriter.write(body1,writeSheet1);
        excelWriter.finish();

    }

    private static List<Map<String,Object>> map(){
        List<Map<String,Object>> rs= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("id","id"+1);
            map.put("name","name"+i);
            map.put("age","age");
            map.put("cost","cost");
            map.put("price","price");
            map.put("233",new Date(System.currentTimeMillis()));
            map.put("order","order");
            map.put("movie",12313323);
            rs.add(map);
        }
        return rs;
    }
    private static List<Map<String,Object>> map1(){
        List<Map<String,Object>> rs= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("id1","id"+1);
            map.put("name1","na123me"+i);
            map.put("age2","a123ge");
            map.put("cost3","co123st");
            map.put("price4","pric123e");
            map.put("2335",new Date(System.currentTimeMillis()));
            map.put("order6","orde231213r");
            map.put("movie7",12311233323L);
            rs.add(map);
        }
        return rs;
    }









    private static List<List<String>> head() {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> head0 = new ArrayList<String>();
        head0.add("字符串" + System.currentTimeMillis());
        List<String> head1 = new ArrayList<String>();
        head1.add("数字" + System.currentTimeMillis());
        List<String> head2 = new ArrayList<String>();
        head2.add("日期" + System.currentTimeMillis());
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    private static List<List<Object>> dataList() {
        List<List<Object>> list = new ArrayList<List<Object>>();
        for (int i = 0; i < 10; i++) {
            List<Object> data = new ArrayList<Object>();
            data.add("字符串" + i);
            data.add(new Date());
            data.add(0.56);
            list.add(data);
        }
        return list;
    }
}
