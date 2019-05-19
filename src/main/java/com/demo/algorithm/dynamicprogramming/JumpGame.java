package com.demo.algorithm.dynamicprogramming;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个位置。
 */
public class JumpGame {
    /**
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        // dp 表示到达第i个位置还剩余多少可以跳的跳力 如果dp[i-1]和nums[i-1]都为0，说明之前最多能够跳到第i-1位置
        int[] dp = new int[nums.length];
        for (int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i-1])-1;
            if (dp[i]<0){
                return false;
            }
        }
        return true;
    }
}
