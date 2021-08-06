package com.main;

import java.util.ArrayList;
import java.util.List;

public class Main2021年8月5日 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(null);
        a.add("233");
        System.out.println(a.contains(null));
        System.out.println(a.contains("233"));
    }
}
