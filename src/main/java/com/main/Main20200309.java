package com.main;

        import cn.hutool.json.JSONObject;
        import cn.hutool.json.JSONUtil;
        import com.alibaba.fastjson.JSON;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Set;

public class Main20200309 {
    public static void main(String[] args) {
        String jsonStr= "{\"a\":1,\"b\":2,\"c\":null}";
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);


        Map<String, Object> innerMap = JSON.parseObject(jsonStr).getInnerMap();


        System.out.println(new HashMap<String,Object>(16){{jsonObject.entrySet().forEach(one -> put(one.getKey(),one.getValue()));}});
    }
}
