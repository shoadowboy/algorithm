package com.demo.algorithm.array;

import java.util.Arrays;


public class KdiffPairs {
    public static int findPairs(int[] nums, int k) {
        if(nums==null||nums.length<2){
            return 0;
        }
        int total = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if (checkIsFind(nums[i]+k,i+1,nums)){
                total++;
            }

        }
        return  total;
    }
        private static boolean checkIsFind(int target,int left,int[] nums){
            int right = nums.length-1;
            if(nums[left]>target||nums[right]<target){
                return false;
            }

            while(left<=right){
                if(left==right-1){
                    if(nums[left]==target||nums[right]==target){
                        return true;
                    }
                    return false;
                }
                int mid = (left+right)/2;
                if(nums[mid]==target){
                    return true;
                }else if(nums[mid]>target){
                    right = mid;
                }else{
                    left = mid;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int k = 1;
        int[] nums ={1,2};
        int total = findPairs(nums,k);
        System.out.println(total);
    }
}
