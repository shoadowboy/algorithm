package com.demo.algorithm.array;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
                //确定nums[i]的值对应的下标不越界，同时排除num[i]本身位置正确或者nums[i]应该放入的位置nums[i]-1原本就是nums[i](如[1,1])
                int index = nums[i];//
                nums[i] = nums[index -1];
                nums[index -1]=index;
            }else{
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length+1;
    }




    public static void main(String[] args) {
        int[] nums = {1, 2, -1, 4};
        int i = firstMissingPositive(nums);
        System.out.println(i);
    }
}
