package com.demo.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * @author peichunle
 * Note:Each element in the result must be unique.
 * The result can be in any order.
 * 思路  第一个数组存hash 遍历第二个数组，存在的话取出来 
 */
public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null||nums1.length==0||nums2.length==0)
			return new int[]{};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i : nums1) {
			map.put(i, i);
		}
		int intersection = 0;
		for(int i=0;i<nums2.length;i++){
			if(map.containsKey(nums2[i])){
				nums2[intersection] =nums2[i];
				map.remove(nums2[i]);
				intersection++;
			}
		}
		if(intersection==0){
			return new int[]{};
		}
        return Arrays.copyOfRange(nums2, 0, intersection);
    }
}
