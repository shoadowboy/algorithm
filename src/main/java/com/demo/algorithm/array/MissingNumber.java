package com.demo.algorithm.array;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * 1 直接求和，然后跟正常之和进行比较，差值就是缺失的
 * 2 bitmap 为空的就是缺失的
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum+=num;
        }

        return nums.length*(nums.length+1)/2-sum;
    }


    public static void main(String[] args) {
        int[] nums = {1,0};
        int i = missingNumber(nums);
        System.out.println(i);
    }
}
