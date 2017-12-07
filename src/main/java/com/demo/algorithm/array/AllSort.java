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
        // write your code here
        List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if(nums==null||nums.length==0){
    	    list.add(new ArrayList<Integer>());
    		return list;
    	}

    	fullArraySort(nums, 0, nums.length-1, list);
    	return list;
    }
    
    private static void fullArraySort(int[] nums,int left,int right,List<List<Integer>> result){
    	if(left == right){
    		List<Integer> listResult = new ArrayList<Integer>();
    		for(int i=0;i<nums.length;i++){
    			listResult.add(nums[i]);
    		}
			result.add(listResult );
			return ;
    	}
    		
    	//把当前节点和末尾节点交换
		for(int i=left;i<nums.length;i++){
			//
			if(checkIsRepeat(nums, left, i)){
				continue;
			}
			swap(nums, left, i);
			fullArraySort(nums, left+1, right, result);
			swap(nums, left, i);
		}
		
    }

	private static void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left]= nums[right];
		nums[right] = tmp;
	}
    
	private static boolean checkIsRepeat(int[] nums,int left,int right){
		for(int i=left;i<right;i++){
			if(nums[i] == nums[right]){
				return true;
			}
		}
		return false;
	}
    
    public static void main(String[] args) {
		int[] a = new int[]{1,2,2};
		List<List<Integer>> list = permute(a);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
    	
}
