package com.力扣高频面试算法;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author geshijie
 * @date 2019-03-13 10:00
 *
 * 开始之前
 * 在进入正题之前，不妨先让我们回顾几个有意思的经典互联网公司的面试题目，热热身。
 *
 */
public class Demo {

    /**
     *
     * @param nums 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @return int
     *
     * 使用异或运算  1^1 的0  1^0 的 1
     */
    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = num ^ nums[i];
        }
        return num;
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 这道题用摩尔投票法，这种方法是因为题目中说众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 所以设置一个计数器，选定第一个值作为起始值，然后后面的值如果是这个值那么计数加一，如果不等，那么计数减一，当计数器的值为零时，选取当前值作为新值继续计数。因为众数肯定大于1/2所以最后计数器不为零的数肯定是众数。
     * @param nums
     * @return int
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int num = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(num == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    num = nums[i];
                    count++;
                }

            }
        }
        return num;
    }
    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 因为出现次数大于2  排序后肯定出现在中间
     * @param nums
     * @return int
     */
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
     * @param matrix
     * @param target
     * @return
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if(0==(target^anInt)){
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, idx = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[idx--] = nums2[j--];
            }
            else {
                nums1[idx--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
        System.out.println(nums1);
    }



    public int superEggDrop(int K, int N) {
        return N;
    }


    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1,2,1}));

        System.out.println(majorityElement(new int[]{2,2,2,1,1,1,1,2,2}));

        System.out.println(majorityElement2(new int[]{2,2,2,1,1,1,1,2,2}));

        int[][] matrix= {
                      {1,   4,  7, 11, 15},
                      {2,   5,  8, 12, 19},
                      {3,   6,  9, 16, 22},
                      {10, 13, 14, 17, 24},
                      {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix,20));

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
}
