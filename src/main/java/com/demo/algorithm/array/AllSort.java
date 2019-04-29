package com.demo.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数字列表，返回其所有可能的排列。 一共有n! 
 * @author peichunle
 *
 */
public class AllSort {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
       public static List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   if(nums.length == 0) return list;
		   process(nums, 0, list);
		   return list;
	   }

	public static void process(int[] nums, int i, List<List<Integer>> list){
		if(i == nums.length){
			List<Integer> arr = new ArrayList<>();
			for(Integer item : nums)
				arr.add(item);
			list.add(arr);
			return;
		}
		for(int j = i; j < nums.length; j++){
			swap(nums, j, i);
			process(nums, i+1, list);
			swap(nums, i, j);
		}
	}
	public static void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
    
    public static void main(String[] args) {
		int[] a = new int[]{1,2,2};
		List<List<Integer>> list = permute(a);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
    	
}
