package com.策略模式.lambda;

import cn.hutool.json.JSONObject;

public class PersonFactory{
    public static Person initPerson(String name ,String gender){
        Person p = new Person();
        p.setName(name);
        p.setGender(gender);
        return p;
    }
}
