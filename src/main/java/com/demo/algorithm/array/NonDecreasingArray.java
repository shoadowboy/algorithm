package com.demo.algorithm.array;

/**
 * 
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).</br>
 * Example 1:</br>
 * Input: [4,2,3]</br>
 * Output: True</br>
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.</br>
 * Example 2:</br>
 * Input: [4,2,1]</br>
 * Output: False</br>
 * Explanation: You can't get a non-decreasing array by modify at most one element.</br>
 * Note: The n belongs to [1, 10,000].
 * @author peichunle
 *
 */
public class NonDecreasingArray {
	public boolean checkPossibility(int[] nums) {
		if(nums==null||nums.length<=1){
			return true;
		}
		for(int i=1;i<nums.length;i++){
			
		}
		return true;
    }
}
