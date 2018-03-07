package com.demo.algorithm.array;


/**
 *Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 * 最长连续递增数组长度
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums==null||nums.length==0)
            return  0;

        int maxLCIS = 1;
        int tmp = 1;

        for (int i=1;i<nums.length;i++) {
            if(nums[i]<=nums[i-1]){
                if(tmp>maxLCIS){
                    maxLCIS = tmp;
                }
                tmp = 1;
            }else{
                tmp++;
            }
        }
        return maxLCIS>tmp?maxLCIS:tmp;
    }
}
