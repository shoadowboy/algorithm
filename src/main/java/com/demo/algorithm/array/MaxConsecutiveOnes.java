package com.demo.algorithm.array;

/**
 * Given a binary array, 
 * find the maximum number of consecutive 1s in this array.
 * @author peichunle
 * Example 
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * 思路：
 * 连续遍历，存下当前连续为1最多的个数，碰到0中断判断当前连续个数是否比之前大，
 */
public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		if(nums==null||nums.length ==0){
			return 0;
		}
		int max = 0;
		int tmp = 0;
		for(int i=0;i<nums.length;i++){
			if (nums[i] == 1) {
				tmp++;
				
			} else {
				if (tmp > max) {
					max = tmp;
				}
				tmp = 0;
			}
			if(i==nums.length-1&&tmp > max){
					max = tmp;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1,1};
		int findMaxConsecutiveOnes = findMaxConsecutiveOnes(nums);
		System.out.println(findMaxConsecutiveOnes);
	}
}
