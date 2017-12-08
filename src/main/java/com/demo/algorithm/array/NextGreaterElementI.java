package com.demo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given two arrays (without duplicates) nums1 and nums2
 *  where nums1’s elements are subset of nums2. 
 * Find all the next greater numbers for nums1's elements 
 * in the corresponding places of nums2.
 * Example 
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * @author peichunle
 * 思路：
 * 1 简单粗暴直接双重循环 o(m*n)复杂度
 * 后续优化 考虑存map可以判断第二个有没有该元素
 *
 */
public class NextGreaterElementI {
//	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//		 int[] result = new int[nums1.length];
//		 
//		 
//		 for(int i=0;i<nums1.length;i++){
//			 result[i] = -1;
//			 boolean isExist =false;
//			 for(int j=0;j<nums2.length;j++){
//				 if(nums2[j]==nums1[i]){
//					 isExist=true;
//					 continue;
//				 }
//				 if(isExist&&nums2[j]>nums1[i]){
//					 result[i] = nums2[j];
//					 break;
//				 }
//			 }
//		 }
//		 return result;
//	 }
	
	 /**
	  * 先存下hash 这个
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 
		 int[] result = new int[nums1.length];
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<nums2.length;i++){
			 //可能出现覆盖 加个判断
			 if(map.containsKey(nums2[i])){
				 map.put(nums2[i], i);
			 }
		 }
		 for(int i=0;i<nums1.length;i++){
			 result[i]= -1;
			 if(!map.containsKey(nums1[i])){
				 continue;
			 }
			 for(int j=map.get(nums1[i]);j<nums2.length;j++){
				 if(nums2[j]>nums1[i]){
					 result[i] = nums2[j];
					 break;
				 }
			 }
		 }
		 
		 return result;
	 }
}
