package com.demo.algorithm.array;

import java.net.NetPermission;
import java.util.Arrays;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        for (int i=nums.length-1;i>0;i--){
            // 说明找到了
            if (nums[i-1]<nums[i]){
                int biggerIndex = i;
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j]<nums[biggerIndex]&&nums[j]>nums[i-1]){
                        biggerIndex = j;
                    }
                }
                int temp = nums[i-1];
                nums[i-1] =  nums[biggerIndex];
                nums[biggerIndex] = temp;
                Arrays.sort(nums,i,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
//        int[] intnums = {1,2,3};
//        int[] nums = {3,2,1};
        int[] nums = {1,3,2};
        new NextPermutation().nextPermutation(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
