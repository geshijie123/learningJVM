package com.iduitl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.Date;

import static cn.hutool.core.date.DatePattern.PURE_DATETIME_MS_PATTERN;

public class IdUtil {
    public static void main(String[] args) {
            String time = DateUtil.format(new Date(System.currentTimeMillis()), PURE_DATETIME_MS_PATTERN);
            int userId = 88;
            String end=RandomUtil.randomNumbers(10);
            String orderId= (time+ userId +end).substring(0,20);



        System.out.println(orderId);
        System.out.println(orderId.length());

    }
}
