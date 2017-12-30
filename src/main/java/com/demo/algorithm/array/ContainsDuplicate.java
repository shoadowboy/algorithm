package com.demo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * @author peichunle
 * 思路：如果允许用额外空间，o（N），o（N）
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length<2){
        	return false;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(nums.length);
        for (int i : nums) {
			if(map.containsKey(i)){
				return true;
			}else{
				map.put(i, i);
			}
		}
        return  false;
    }
}
