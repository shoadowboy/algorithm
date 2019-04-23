package com.demo.algorithm.array;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * 二分查找
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if (nums.length==0){
            return res;
        }
        int left = 0;
        int right =nums.length-1;
        if (nums[left]>target||nums[right]<target){
            return res;
        }
        if (nums.length==1){
                return new int[]{0,0};
        }
        while (left<right){
            if (left==right-1){
                if (nums[left]==target&&nums[right]==target){
                    res [0] = left;
                    res [1] = right;
                }else if (nums[left]==target){
                    res[0] = left;
                    res [1] = left;
                }else if (nums[right] ==target){
                    res[0] = right;
                    res [1] = right;
                }
                return res;
            }
            int mid = (left+right)/2;
            if (nums[mid]>target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid;
            }else{
                // 中间等于target的话，找到左侧第一个等于target的，找到右侧最后一个等于target的
                res[1] = findRight(nums,mid,right,target);
                res[0] = findleft(nums,left,mid,target);
                return res;
            }
        }
        return res;
    }
    private int findRight(int[] nums,int begin,int end,int target){

        while (begin<end-1) {
            int mid = (begin+end)/2;
            if (nums[mid]<=target){
                begin = mid;
            }else {
                end = mid;
            }
        }
        return nums[end]==target?end:begin;
    }

    private int findleft(int[] nums,int begin,int end,int target){
        while (begin<end-1) {
            int mid = (begin+end)/2;
            if (nums[mid]>=target){
                end = mid;
            }else {
                begin = mid;
            }
        }
        return nums[begin]==target?begin:end;
    }

    public static void main(String[] args) {
        int[] nums = {3};
        int target = 2;
        int[] searchRange = new FindFirstandLastPositionofElementinSortedArray().searchRange(nums, target);
        for (int i : searchRange) {
            System.out.println(i);
        }
    }
}
