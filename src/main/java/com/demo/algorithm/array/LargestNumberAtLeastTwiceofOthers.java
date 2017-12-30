package com.demo.algorithm.array;

/**
 * 
 * In a given integer array nums, there is always exactly one largest element.
 * 
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * 
 * If it is, return the index of the largest element, otherwise return -1.</br>
 * 
 * Example 1: </br>
 * Input: nums = [3, 6, 1, 0] </br>
 * Output: 1</br>
 *  Explanation: 6 is the largest integer, and for every other number in
 * the array x, 6 is more than twice as big as x. The index of value 6 is 1, so we return 1. </br>
 * Example 2: </br>
 * Input: nums =[1, 2, 3, 4] </br>
 * Output: -1 </br>
 * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.</br>
 *  Note: </br>
 *  nums will have a length in the range [1, 50].</br>
 *  Every nums[i] will be an integer in the range [0, 99].
 * 
 * @author peichunle
 * 保留两个数，最大，和第二大的
 */
public class LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
		if(nums==null||nums.length==0){
			return -1;
		}
		if(nums.length==1){
			return 0;
		}
		int maxNumIndex = 0;
		int secondMaxNumIndex = 1;
		if(nums[maxNumIndex] < nums[secondMaxNumIndex]){
			maxNumIndex = 1;
			secondMaxNumIndex=0;
		}
		for(int i=2;i<nums.length;i++){
			if(nums[i]>=nums[maxNumIndex]){
				secondMaxNumIndex = maxNumIndex;
				maxNumIndex = i;
			}else if(nums[i]>=nums[secondMaxNumIndex]){
				secondMaxNumIndex = i;
			}
		}
		if(nums[maxNumIndex]-nums[secondMaxNumIndex]*2>=0){
			return maxNumIndex;
		}
        return -1;
    }
}
