package com.demo.algorithm.dynamicprogramming;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * @author peichunle
 * 保存当前最大数组和，计算总和不为0就继续加下一个，为0就算出前n个数中最大和
 */
public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int max =Integer.MIN_VALUE;
		int subSum =Integer.MIN_VALUE;
		//是否是一个新的子数组
		boolean isNewSub = true;
		for(int i=0;i<nums.length;i++){
			if(isNewSub){
				if(nums[i]<0){
					if(nums[i]>max){
						max = nums[i];
					}
				}else{
					isNewSub = false;
					subSum = nums[i];
				}
			}else{
				
					
				if(subSum+nums[i]<0){
					isNewSub = true;
				}else{
					subSum += nums[i];
				}
			}
			if(subSum>max){
				max = subSum;
			}
//			System.out.println("subsum:"+subSum+"nums"+nums[i]+"max:"+max);
		}
		return max>subSum?max:subSum;
    }
//
//	public int maxSubArray(int[] nums) {
//		int maxEndingHere = 0, 
//		int maxSoFar = Integer.MIN_VALUE;
//		for (int i = 0; i < nums.length; i++) {
//			maxEndingHere += nums[i];
//			if (maxEndingHere > maxSoFar){
//				maxSoFar = maxEndingHere;
//			}
//			if (maxEndingHere < 0){
//				maxEndingHere = 0;
//			}
//		}
//		return maxSoFar;
//	}
	public static void main(String[] args) {
		int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,4};
		int maxSubArray = maxSubArray(nums );
		System.out.println(maxSubArray);
	}
}
