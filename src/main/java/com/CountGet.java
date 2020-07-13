package com;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountGet {
    public static void main(String[] args) {

        String s="[{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"A\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"A\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"A\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"联通\",\"channel\":\"A\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"联通\",\"channel\":\"A\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"北京\",\"isp\":\"电信\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"黑龙江\",\"isp\":\"联通\",\"channel\":\"B\"},{\"date\":\"2019-11-13\",\"province\":\"黑龙江\",\"isp\":\"联通\",\"channel\":\"B\"},{\"date\":\"2019-11-13\",\"province\":\"湖南\",\"isp\":\"联通\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"湖南\",\"isp\":\"联通\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"湖南\",\"isp\":\"联通\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"湖南\",\"isp\":\"联通\",\"channel\":\"C\"},{\"date\":\"2019-11-13\",\"province\":\"湖南\",\"isp\":\"联通\",\"channel\":\"C\"}]";

        Long l=System.currentTimeMillis();


        // Gson
        List<Map<String,Object>> list=new Gson().fromJson(s, List.class);
        System.out.println(list.get(0).get("date"));
        long Gson = System.currentTimeMillis();
        System.out.println("Gson>>"+(Gson-l));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(CountGet::initKey, Collectors.counting()));
        collect.entrySet().stream().forEach(stringLongEntry -> {
            System.out.println(stringLongEntry.getKey()+"   "+stringLongEntry.getValue());
        });

        /*// hutool
        JSONArray jsonObject=new JSONArray(s);
        System.out.println(jsonObject.getJSONObject(0).get("date"));
        long hutool = System.currentTimeMillis();
        System.out.println("hutool>>"+(hutool-l));
        // fastjson
        List<Map<String,Object>> parse = JSON.parseObject(s,List.class);
        System.out.println(parse.get(0).get("date"));
        long fastjson = System.currentTimeMillis();
        System.out.println("fastjson>>"+(fastjson-l));*/

    }

    private static String initKey(Map<String,Object> map){
        return map.get("province").toString()+map.get("isp").toString()+map.get("channel").toString();
    }
}
