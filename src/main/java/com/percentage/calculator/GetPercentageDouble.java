package com.percentage.calculator;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 *
 *  获取一组数字的百分比  子类之和等于 1
 * @author geshijie
 */
public class GetPercentageDouble {
    /**
     *
     * @param valueList  参数列 as:[3,4,4]
     * @param idx    所求目标数字的下标
     * @param precision     小数精度
     * @return  0-100的百分比
     */
    public static Double calculator(double[] valueList, int idx, int precision){

        if(idx<0||valueList.length<(idx+1)){
            return 0d;
        }

        // 计算 valueList 中所有数据项之和
        double sum = Arrays.stream(valueList).reduce((a, b) -> a+b).getAsDouble();

        if(sum==0d){
            return 0d;
        }

        // 中间值, 用来计算总席位数和扩大比例来保留精度
        double digits = Math.pow(10, precision);


        // 计算每组数据的得票结果(整数部分和余额部分): 整数部分为所得该数据首次分配席位, 余额部分决定首次分配之后剩余席位的分配
        // 乘以 digits, 是为了通过扩大比例来保留精度, 这样可以确保正数部分是已经确定的议席位置
        // 乘以 100, 是因为最后返回结果为百分比
        double[] votesPerQuota =Arrays.stream(valueList).map(one->(one/sum)*digits*100d).toArray();


        // 总席位数: 因为所有quota除以sum之和为1, 上一步计算为了保留精度和返回为百分比, 把得票结果扩大了 digits*100 倍, 因此总席位数计算方式如下
        double targetSeats= digits * 100 ;


        // 首次分配席位
        double[] seats = Arrays.stream(votesPerQuota).map(one->Math.floor(one)).toArray();

        // 当前已经分配出去的席位总数
        double currentSum = Arrays.stream(seats).reduce((a,b)->a+b).getAsDouble();

        // 计算每个quota的余额
        double[] remainder = IntStream.range(0, votesPerQuota.length).mapToDouble(one -> votesPerQuota[one]-seats[one]).toArray();


        // 分配剩余席位, 直到所有席位分配完毕
        while(currentSum<targetSeats){
            double max = Double.MIN_VALUE; // 最大余额, 初始重置为无穷小
            int maxId=0;                    // 余数最大的 id
            // 选出这组余额数据中最大值
            for (Integer i=0,len=remainder.length;i<len;++i){
                if(remainder[i]>max){
                    max = remainder[i];
                    maxId = i;
                }
            }
            ++seats[maxId];         // 最大余数对应数据席位 +1
            remainder[maxId]=0;     // 最大余数重置为 0, 保证不会再分配
            ++currentSum;           // 当前已分配席位总数 +1, 保证最终可以退出分配循环
        }



        // idx 对应数据分配的席位除以总席位数就是 idx 在这组数据中保留精度 precision 的百分比
        return seats[idx]/digits;
    }

    public static void main(String[] args) {
        double[] doubles={4d};
        System.out.println(calculator(doubles ,0,2));
//        System.out.println(calculator(doubles ,1,2));
//        System.out.println(calculator(doubles ,2,2));
//        System.out.println(calculator(doubles ,0,2)+calculator(doubles ,1,2)+calculator(doubles ,2,2));
    }
}
