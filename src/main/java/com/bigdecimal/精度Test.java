package com.bigdecimal;

import java.math.BigDecimal;

public class 精度Test {
    public static void main(String[] args) {
//        String a="0.582608";
        double a=0.582608;

        System.out.println(""+new BigDecimal(a).multiply(new BigDecimal(100)));
        System.out.println(""+new BigDecimal(a+"").multiply(new BigDecimal(100)));

    }
}
