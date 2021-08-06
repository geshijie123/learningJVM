package com.策略模式.lambda;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

@Data
public  class Person{

        public static String MAN = "man";
        public static String WOMAN = "woman";

        private String gender;
        private String name;

        private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
        static {
            FUNC_MAP.put(MAN,person ->System.out.println(person + "应该去男厕所"));
            FUNC_MAP.put(WOMAN,person ->System.out.println(person + "应该去女厕所"));
        }

        public void goToWC(){
            FUNC_MAP.get(gender).accept(name);
        }
    }