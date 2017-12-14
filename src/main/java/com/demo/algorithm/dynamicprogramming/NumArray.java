package com.demo.algorithm.dynamicprogramming;
/**
 * Given an integer array nums, find the sum of the elements 
 * between indices i and j (i ≤ j), inclusive.
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * 1 You may assume that the array does not change.
 * 2 There are many calls to sumRange function.
 * @author peichunle
 *	思路：计算出每一个数组从0到当前位置的和，前一个位置总和加上当前位置
 */
class NumArray{
	int[] sumnums = null;
	public NumArray(int[] nums) {
		if(nums==null||nums.length==0){
			return;
		}
		this.sumnums = new int[nums.length];
		//
		sumnums[0] = nums[0];
		for(int i=1;i<nums.length;i++){
			sumnums[i]=sumnums[i-1]+nums[i];
		}
	}
	public int sumRange(int i, int j) {
		if(i==0){
			return sumnums[j];
		}
		return sumnums[j]-sumnums[i-1];
	}
}
