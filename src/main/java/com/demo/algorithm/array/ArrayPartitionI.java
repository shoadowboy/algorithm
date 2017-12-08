package com.demo.algorithm.array;

import java.util.Arrays;

/**
 * leetcode 
 * Given an array of 2n integers, your task is to group these integers 
 * into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * Example 
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * @author peichunle
 * 
 * 思路：1 数组排序，每个取最近的
 * 	   2(后续优化)
 *
 */
public class ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
    	Arrays.sort(nums);
    	int total = 0;
    	for(int i=0;i<nums.length;i=i+2){
    		total += nums[i];
    	}
        return total;
    }
    
    public static void main(String[] args) {
		int[] a =new int[]{1,2,3,4,5,6};
		int sum = arrayPairSum(a);
		System.out.println(sum);
	}
}
