package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2020_04_08 {
    public static void main(String[] args) {
        System.out.println(getNum(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{3, 4, 5, 1, 2})+1);
    }
    /**
     * 1、第一题. 字节跳动在北京有N个工区，形成一个环状，Bytebus是往返在各个工区的通勤车，按工区的顺序行驶，其中第 i 个工区有汽油 gas[i] 升。
     * 你有一辆油箱容量无限的的Bytebus，从第 i 个工区开往第 i+1 个工区需要消耗汽油 cost[i] 升。你从其中的一个工区出发，开始时油箱为空。如果你
     * 可以绕环路行驶一周，则返回出发时工区的编号，否则返回 -1。
     * 输入:
     * 油     gas =  [1,2,3,4,5]
     * 消耗油 cost = [3,4,5,1,2]
     * <p>
     * 输出: 3
     * @return  结果需要加一 因为输出的是下标 第三个下标为2 2+1=第三个
     */
    static int getNum(Integer[] gas, Integer[] cost) {
        int bugLossGas = 0;
        int size = gas.length;
        for (int a = 0; a < size; a++) {
            int i = a;
            while (true) {
                Integer oneGas = gas[i];
                bugLossGas += oneGas;
                Integer oneCost = cost[i];
                int rs = bugLossGas - oneCost;
                if (rs <= 0) {
                   break;
                } else {
                    i++;
                    if (i == size) {
                        i = 0;
                    }
                    if (i == a) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

}
