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
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(nums,target));

        System.out.println(searchIndex(nums,target));
    }

    public static int searchIndex(int[] nums, int target) {
        // 多次二分查找
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < nums[right]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

}
