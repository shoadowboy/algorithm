package com.demo.algorithm.array;

/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index 
 * is equal to the sum of the numbers to the right of the index.
 * If no such index exists, we should return -1. If there are multiple pivot indexes,
 *  you should return the left-most pivot index.
 *  Example ：
 *  Input: 
 *  nums = [1, 7, 3, 6, 5, 6]
 *  Output: 3
 *  Explanation: 
 *  The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of
 *   numbers to the right of index 3.
 *  Also, 3 is the first index where this occurs.
 *  Note:
 *  The length of nums will be in the range [0, 10000].
 *  Each element nums[i] will be an integer in the range [-1000, 1000].
 * @author peichunle
 *思路：先算出总和，然后再遍历数组，保留左边之和和右边之和，判断左边之和是否等于右边之和-当前数，返回此下标，O（N）.
 */
public class FindPivotIndex {
	public static int pivotIndex(int[] nums) {
        if(nums==null||nums.length==0){
        	return -1;
        }
        int rignt = 0;
        for (int i : nums) {
        	rignt+=i;
		}
        int left = 0;

        for(int i=0;i<nums.length;i++){
        	if(rignt-nums[i]==left ){
        		return i;
        	}else{
        		rignt-=nums[i];
        		left+=nums[i];
        	}
        }
        return -1;
    }
	
	public static void main(String[] args) {
//		int[] nums={-1,-1,-1,-1,-1,0};	
		int[] nums={-1,-1,-1,0,1,1};
//		int[] nums ={1, 7, 3, 6, 5, 6};
		int pivotIndex = pivotIndex(nums);
		System.out.println(pivotIndex);
	}
}
