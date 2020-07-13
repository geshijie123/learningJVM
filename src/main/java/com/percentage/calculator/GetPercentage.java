package com.percentage.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetPercentage {


    /**
     *
     * @param valueList  参数列 as:[3,4,4]
     * @param idx    所求目标数字的下标
     * @param precision     小数精度
     * @return  0-100的百分比
     */
    public static BigDecimal calculator(List<BigDecimal> valueList, int idx, int precision){

//        if (!valueList[idx]){
//        } return 0;
        if(idx<0||valueList.size()<(idx+1)){
            return new BigDecimal(0);
        }


        // 计算 valueList 中所有数据项之和
//        sum = valueList.reduce(function(acc, val) {
//            return acc + val;
//        }, 0);
        BigDecimal sum = valueList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

//        if (sum === 0) return 0;
        if(sum.compareTo(new BigDecimal(0))==0){
            return new BigDecimal(0);
        }


        // 中间值, 用来计算总席位数和扩大比例来保留精度
//        var digits = Math.pow(10, precision);
        double digits = Math.pow(10, precision);


        // 计算每组数据的得票结果(整数部分和余额部分): 整数部分为所得该数据首次分配席位, 余额部分决定首次分配之后剩余席位的分配
//        var votesPerQuota = valueList.map(function(val) {
//            // 乘以 digits, 是为了通过扩大比例来保留精度, 这样可以确保正数部分是已经确定的议席位置
//            // 乘以 100, 是因为最后返回结果为百分比
//            return (val / sum) * digits * 100;
//        });
        List<BigDecimal> votesPerQuota=valueList.stream().map(one->(one.divide(sum,0,BigDecimal.ROUND_DOWN)).multiply(new BigDecimal(digits)).multiply(new BigDecimal(100))).collect(Collectors.toList());


        // 总席位数: 因为所有quota除以sum之和为1, 上一步计算为了保留精度和返回为百分比, 把得票结果扩大了 digits*100 倍, 因此总席位数计算方式如下
//        var targetSeats = digits * 100;
        double targetSeats= digits * 100 ;


        // 首次分配席位
//        var seats = votesPerQuota.map(function(votes) {
//            return Math.floor(votes); // 整数部分就是每个quota首次分配的席位
//        });
        List<Double> seats = votesPerQuota.stream().map(one->Math.floor(one.doubleValue())).collect(Collectors.toList());

        // 当前已经分配出去的席位总数
//        var currentSum = seats.reduce(function(acc, val) {
//            return acc + val;
//        }, 0);
        double currentSum = seats.stream().reduce(Double::sum).get();

        // 计算每个quota的余额
//        var remainder = votesPerQuota.map(function(votes, idx) {
//            return votes - seats[idx];
//        });
        List<BigDecimal> remainder = votesPerQuota.stream().map(one -> one.subtract(new BigDecimal(seats.get(votesPerQuota.indexOf(new BigDecimal(one.toString())))))).collect(Collectors.toList());

        // 分配剩余席位, 直到所有席位分配完毕
//        while (currentSum < targetSeats) {
//            var max = Number.NEGATIVE_INFINITY; // 最大余额, 初始重置为无穷小
//            var maxId = null; // 余数最大的 id
//
//            // 选出这组余额数据中最大值
//            for (var i = 0, len = remainder.length; i < len; ++i) {
//                if (remainder[i] > max) {
//                    max = remainder[i];
//                    maxId = i;
//                }
//            }
//            ++seats[maxId];       // 最大余数对应数据席位 +1
//            remainder[maxId] = 0; // 最大余数重置为 0, 保证不会再分配
//            ++currentSum;         // 当前已分配席位总数 +1, 保证最终可以退出分配循环
//        }

        while(currentSum<targetSeats){
            Integer max = Integer.MIN_VALUE;
            Integer maxId=null;
            for (Integer i=0,len=remainder.size();i<len;++i){
                if(remainder.get(i).intValue()>max){
                    max = remainder.get(i).intValue();
                    maxId = i;
                }
            }
            seats.set(maxId,seats.get(maxId)+1);
            remainder.set(maxId,new BigDecimal(0));
            ++currentSum;
        }



        // idx 对应数据分配的席位除以总席位数就是 idx 在这组数据中保留精度 precision 的百分比
//        return seats[idx] / digits;
        return BigDecimal.valueOf(seats.get(idx)/digits);
    }

    public static void main(String[] args) {
        List<BigDecimal> bigDecimalslist= Arrays.asList(new BigDecimal(3),new BigDecimal(4),new BigDecimal(4));
        System.out.println(calculator(bigDecimalslist ,0,2));
        System.out.println(calculator(bigDecimalslist ,1,2));
        System.out.println(calculator(bigDecimalslist ,2,2));
        System.out.println(calculator(bigDecimalslist ,0,2).add(calculator(bigDecimalslist ,1,2)).add(calculator(bigDecimalslist ,2,2)));
    }
}
