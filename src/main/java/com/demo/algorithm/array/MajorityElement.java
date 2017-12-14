package com.demo.algorithm.array;

/**
 * Given an array of size n, find the majority element. The majority element is the 
 * element that appears more than  n/2  times.
 * You may assume that the array is non-empty and the majority element
 *  always exist in the array.
 * @author peichunle
 *	思路：判断当前元素和第I个元素是否相等，如果相等count++,count为0的话重置为当前元素，
 *总数大于n/2，无论怎么分布都是该元素最多
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int elem = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				elem = nums[i];
				count = 1;
			} else {
				if (elem == nums[i])
					count++;
				else
					count--;
			}

		}
		return elem;
    }
}
