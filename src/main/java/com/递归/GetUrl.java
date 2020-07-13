package com.递归;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class GetUrl {


    public static void main(String[] args) {
        updateOnlineOrderDataByDay(DateUtil.parseDate("2019-09-13"),1);
    }
    static void  updateOnlineOrderDataByDay(Date date, int page){
        JSONObject jsonObject = MovieOrder(DateUtil.format(date, "yyyy-MM-dd"), page);
        int orderPageCount = jsonObject.getJSONObject("data").getInt("orderPageCount");
        if (orderPageCount > page) {
            page++;
            updateOnlineOrderDataByDay(date, page);
        }
    }

    public static JSONObject MovieOrder(String day, int page) {
        String URL = "https://apiv.kangou.cn/inner/orderList/kangcrm";
        String KEY = "ff1ed97edf3a89ffc07f382ff14078b9";
        HashMap<String, Object> paramMap = new HashMap<>(3);
        paramMap.put("page", page);
        paramMap.put("day", day);
        paramMap.put("sign", getKgCardSign(paramMap, KEY));
        String param="";
        for (String key : paramMap.keySet()){
            System.out.println("key: "+ key + "; value: " + paramMap.get(key));
            param+=key+"="+paramMap.get(key)+"&";
        }
        StringBuffer result = new StringBuffer(HttpUtil.post(URL, paramMap));
        if(result!=null&&result.length()>15){
            System.out.println(result.substring(0,10));
       }else {
            System.out.println("error --------------   "+result);
        }
        return new JSONObject(result);
    }
    public  static String getKgCardSign(HashMap<String, Object> map, String gwkey) {
        Set set = map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        StringBuilder returnStr = new StringBuilder();
        for (Object key : arr) {
            if (map.get(key) != null && !key.equals("sign") && !key.equals("format")) {
                returnStr.append(key.toString());
                returnStr.append("=");
                returnStr.append(map.get(key));
                returnStr.append("&");
            }
        }
        String substring = returnStr.substring(0, returnStr.length() - 1);
        return SecureUtil.md5(gwkey + SecureUtil.md5(substring + gwkey).toLowerCase()).toLowerCase();
    }
}
