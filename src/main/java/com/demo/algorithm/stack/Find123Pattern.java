package com.demo.algorithm.stack;

import java.util.Stack;

public class Find123Pattern {

    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int temp = Integer.MIN_VALUE;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]<temp){
                return true;
            }
            while (!stack.isEmpty()&& nums[i]>stack.peek()){
                temp =stack.pop();
            }
            stack.add(nums[i]);
        }
        return false;
    }
}
