package com.demo.algorithm.dynamicprogramming;

import java.util.HashMap;

/**
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，
 * 其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (k == 0) {
                    if (sum == 0) {
                        return true;
                    } else {
                        break;
                    }
                } else {
                    if (sum % k == 0) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public boolean checkSubarraySum2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (k != 0) preSum %= k;
            int prev = map.getOrDefault(preSum, -2);
            if (prev != -2) {
                if (i - prev + 1 > 2) return true;
            } else map.put(preSum, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(new ContinuousSubarraySum().checkSubarraySum2(nums, k));

    }
}
