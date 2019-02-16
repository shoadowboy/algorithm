package com.demo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, every element appears twice except for one.
 *  Find that single one.
 * @author peichunle
 * 思路：
 * 1 存hash ，把不存在的放到hash中，存在的再次发现从hash移除，最后剩余的就是唯一得数
 * 挑战 Your algorithm should have a linear runtime complexity.
 *  Could you implement it without using extra memory?
 *  2 a^b^b = a
 */
public class SingleNumber {
	/**
	 * 有点慢，考虑加快速度  直接
	 * @param nums
	 * @return
	 */
//	public static int singleNumber(int[] nums) {
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for (int i : nums) {
//			if(map.containsKey(i)){
//				map.remove(i);
//			}else{
//				map.put(i, i);
//			}
//		}
//		
//		return map.keySet().iterator().next();
//    }

	/**
	 * 异或
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int result = 0;
		for (int i : nums) {
			result = result ^ i;
		}
		return result;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,1,2,3};
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);
	}
}
