package com.demo.algorithm.math;

import java.util.Arrays;

/**
 * Given an integer array, find three numbers 
 * whose product is maximum and output the maximum product.
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * Note:
 * The length of the given array will be in range [3,104] and all elements are 
 * in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 
 * 32-bit signed integer.
 * @author peichunle
 * 思路：直接排序。依次讨论前三个，后三个，以及后两个跟第一个，前两个跟最后一个。
 * 2 取出最小的两个 以及最大的三个，然后比较
 *
 */
public class MaximumProductofThreeNumbers {
//	public static int maximumProduct(int[] nums) {
//		Arrays.sort(nums);
//        int n = nums.length;
//        int s = nums[n-1] * nums[n-2] * nums[n-3];
//        s = Math.max(s, nums[n-1] * nums[n-2] * nums[0]);
//        s = Math.max(s, nums[n-1] * nums[1] * nums[0]);
//        s = Math.max(s, nums[2] * nums[1] * nums[0]);
//        return s;
//    }
	public static int maximumProduct(int[] nums) {
        int min = 0, secMin = 0, max = 0, secMax = 0, thirdMax = 0;
        int leng = nums.length;
        if(leng == 3) return nums[0] * nums[1] * nums[2];
        for(int i : nums){
            if(i < min){
                secMin = min;
                min = i;
            }
            else if(i < secMin ) secMin = i;
            if(i > max){
                thirdMax = secMax;
                secMax = max;
                max = i;
            }
            else if(i > secMax){
                thirdMax = secMax;
                secMax = i;
            }
            else if(i > thirdMax) thirdMax = i;
        }
        if(secMin >= 0) return max * secMax * thirdMax;
        else if(min * secMin > secMax * thirdMax) return min * secMin * max;
        else return thirdMax * secMax * max;
    }
	
	public static void main(String[] args) {
		int[] nums ={-1,-2,-3,-4};
		System.out.println(maximumProduct(nums));
	}
	
	
}
