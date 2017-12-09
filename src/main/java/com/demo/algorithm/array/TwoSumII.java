package com.demo.algorithm.array;

/**
 * Given an array of integers that is already sorted in ascending order,
 *  find two numbers such that they add up to a specific target number.
 *  Input: numbers={2, 7, 11, 15}, target=9
 *  Output: index1=1, index2=2
 * @author peichunle
 * 思路：两头夹逼
 *
 */
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
        if(numbers==null||numbers.length<2){
        	return new int[]{};
        }
        if(numbers[0]>target){
        	return new int[]{};
        }
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
        	int sum = numbers[left]+numbers[right];
        	if(sum>target){
        		right--;
        	}else if(sum<target){
        		left++;
        	}else{
        		return new int[]{left+1,right+1};
        	}
        }
        return new int[]{};
    }
}
