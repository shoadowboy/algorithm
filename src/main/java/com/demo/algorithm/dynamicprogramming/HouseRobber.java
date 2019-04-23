package com.demo.algorithm.dynamicprogramming;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 
 * @author peichunle
 *思路：
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length==0){
			return 0;
		}
		if (nums.length==1){
			return nums[0];
		}
		if(nums.length==2){
			return Math.max(nums[0],nums[1]);
		}
		int[] maxPrice = new int[nums.length];
		maxPrice[0] = nums[0];
		maxPrice[1] = Math.max(nums[0],nums[1]);
		for (int i=2;i<nums.length;i++){
			maxPrice[i] = Math.max(maxPrice[i-1],maxPrice[i-2]+nums[i]);
		}
		return maxPrice[nums.length-1];
	}

	public static void main(String[] args) {
		int[] nums ={2,1,1,2};
		int rob = new HouseRobber().rob(nums);
		System.out.println(rob);
	}

}
