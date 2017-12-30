package com.demo.algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? 
 * You may assume the returned list does not count as extra space.
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [5,6]
 * @author peichunle
 * 思路	交换位置，让每个元素处于应当处于的位置，o(N)时间 o(1)空间
 */
public class FindAllNumbersDisappearedinanArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			while (temp != nums[temp - 1]) {
				swap(nums, temp - 1, i);
				temp = nums[i];

			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			if (nums[i] != i + 1)
				list.add(i + 1);
		}
		return list;

	}

	private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
	
	
	public static  List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			while (temp != nums[temp - 1]) {
				swap(nums, temp - 1, i);
				temp = nums[i];

			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				list.add(nums[i]);
		}
		Collections.sort(list);
		return list;
    }
	//如果允许额外空间，设置一个是否存在的数组，再遍历此是否存在的数组即可
//	public List<Integer> findDisappearedNumbers(int[] nums) {
//		boolean [] array = new boolean [nums.length+1];
//		for(int i = 0 ; i < nums.length ; i++){
//			array[nums[i]] = true;
//		}
//		ArrayList<Integer> sol = new ArrayList<Integer>();
//		for(int i = 1 ; i < array.length ; i++){
//			if(array[i] == false) sol.add(i);
//		}
//		return sol;
//	}
	
	//
//	public List<Integer> findDuplicates(int[] nums) {
//		// declare a new arraylist
//		List<Integer> res = new ArrayList<>();
//		for (int i = 0; i < nums.length; ++i) {
//			int index = Math.abs(nums[i]) - 1;
//			if (nums[index] < 0) {
//				res.add(Math.abs(index + 1));
//			}
//			nums[index] = -nums[index];
//		}
//		return res;
//	}
	
	public static void main(String[] args) {
//		int[] nums ={2,2};	
				int[] nums ={4,3,2,7,8,2,3,1};
//		findDisappearedNumbers(nums );
		List<Integer> findDuplicates = findDuplicates(nums);
		for (Integer integer : findDuplicates) {
			System.out.println(integer);
		}
	}
}
