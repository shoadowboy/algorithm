package com.demo.algorithm.array;

public class SearchInRotatedSortedArrayTwo {

    public static boolean search(int[] nums, int target) {
        boolean isReverse = false;
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
            if (nums[i] > target) {
                if (!isReverse) {
                    continue;
                } else {
                    break;
                }
            }
            if (!isReverse && i > 0) {
                if (nums[i] < nums[i - 1]) {
                    isReverse = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        System.out.println(search(nums,target));

    }
}
