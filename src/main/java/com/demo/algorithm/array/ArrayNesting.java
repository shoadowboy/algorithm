package com.demo.algorithm.array;

import java.util.HashSet;

/**
 * 嵌套找，找到置位-1；如果当前为-1 返回结果,要遍历从1到k
 */
public class ArrayNesting {


    public static int arrayNesting(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, check(nums, i,set));
        }
        return max;
    }
    private static int check(int[] nums, int k,HashSet<Integer> set ) {
        int res = 0;
        while (!set.contains(k)) {
            set.add(k);
            k = nums[k];
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={1,0,3,4,2};
        int len = arrayNesting(nums);
        System.out.println(len);
    }
}
