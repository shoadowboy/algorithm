package com.demo.algorithm.array;

import java.util.HashMap;
import java.util.Set;

/**
 * Given a non-empty array of non-negative integers nums, 
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 *  that has the same degree as nums.
 *  Example 1:
 *  Input: [1, 2, 2, 3, 1]
 *  Output: 2
 *  Explanation: 
 *  The input array has a degree of 2 because both elements 1 and 2 appear twice.
 *  Of the subarrays that have the same degree:
 *  [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 *  The shortest length is 2. So return 2.
 *  Example 2:
 *  Input: [1,2,2,3,1,4,2]
 *  Output: 6
 *  Note:
 *  nums.length will be between 1 and 50,000.
 *  nums[i] will be an integer between 0 and 49,999.

 * @author peichunle
 *
 */
public class DegreeofanArray {
	public static int findShortestSubArray(int[] nums) {
		int result = Integer.MAX_VALUE;
		HashMap<Integer,Integer> numsTimes = new HashMap<Integer,Integer>();
		
		HashMap<Integer,Integer> numsFirstIndex = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> numsLastIndex = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			Integer integer = numsTimes.get(nums[i]);
			if(integer==null){
				numsTimes.put(nums[i], 1);
				numsFirstIndex.put(nums[i], i);
				numsLastIndex.put(nums[i], i);
			}else{
				numsTimes.put(nums[i], integer+1);
				numsLastIndex.put(nums[i], i);
			}
		}
		int maxTimes = 0;
		Set<Integer> keySet = numsTimes.keySet();
		for (Integer integer : keySet) {
			if(numsTimes.get(integer)==maxTimes){
//				maxTimes = numsTimes.get(integer);
				if(numsLastIndex.get(integer)-numsFirstIndex.get(integer)+1<result){
					result = numsLastIndex.get(integer)-numsFirstIndex.get(integer)+1;
				}
			}else if(numsTimes.get(integer)>maxTimes){
				maxTimes = numsTimes.get(integer);
				result = numsLastIndex.get(integer)-numsFirstIndex.get(integer)+1;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums ={1,2,2,3,1,4,1};
		System.out.println(findShortestSubArray(nums ));
	}
}
