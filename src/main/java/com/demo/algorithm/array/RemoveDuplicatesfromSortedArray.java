package com.demo.algorithm.array;

/**
 * 删除排序数组中重复数字
 */
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }

        int length =0;

        int tmpNum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=tmpNum){
                length++;
                nums[length] = nums[i];
                tmpNum = nums[i];
            }
        }

        return length+1;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
