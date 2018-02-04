package com.demo.algorithm.array;

import java.util.Arrays;

/**
 * 给一个未排序的数组，求最短子数组排序后使得数组有序
 * 思路：1 排序，然后比较首尾最先改变的数组下标，
 *     2 从左往右遍历的话，如果有序的话当前位置一定是已经遍历到的最大值位置；
 *     从右往左遍历的话，当前位置一定是已经遍历到的最小值位置。如果不是就要记录下beg和end。
 * @author peichunle
 *
 */
public class ShortestUnsortedContinuousSubarray {
	public static int findUnsortedSubarray(int[] nums) {
		int len = nums.length;  
        int max = nums[0];  
        int min = nums[len - 1];  
        int begin = -1;  
        int end = -2;  
        for (int i = 1; i < len; i++) {  
            max = Math.max(max, nums[i]);  
            min = Math.min(min, nums[len - i - 1]);  
            if (max > nums[i]) {  
                end = i;  
            }  
            if (min < nums[len - i - 1]) {  
                begin = len - i - 1;  
            }  
        }  
        return end - begin + 1;  
    }
	
	
	public static void main(String[] args) {
//		int[] nums ={1,2,3,4,5,6};
		
		int[] nums ={1,2,5,4,6};
		System.out.println(findUnsortedSubarray(nums  ));
	}
}
