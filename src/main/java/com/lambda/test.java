package com.lambda;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import java.util.Map;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {

        JSONArray jsonArray=new JSONArray("[{\"key\":\"value1\"}," +
                "{\"key\":\"value2\"},\n" +
                "{\"key\":\"value3\"},\n" +
                "{\"key\":\"value4\"},\n" +
                "{\"key\":\"value5\"},\n" +
                "{\"key\":\"value6\"}]");


        Map<String, JSONObject> key = jsonArray.stream().map(JSONObject::new).filter(one->one.get("key").toString().equals("value2")).collect(Collectors.toMap(
                one -> one.getStr("key"),
                one -> one
        ));

        key.keySet().forEach(one -> System.out.println(one + "  "+ key.get(one).get("key")));

    }
}
