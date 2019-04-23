package com.demo.algorithm.backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 */
//TODO
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(nums.length * nums.length - 1);
        rec(nums, 0, nums.length - 1, result);
        return result;
    }

    public void rec(int[] nums, int begin, int end, List<List<Integer>> result) {
        //循环
        if (begin == end) {
            genneratePermutations(result, nums);
        }
        for (int i = begin; i <= end; i++) {
            if (i != begin && nums[i] == nums[begin]) continue;
            swap(nums, begin, end);
            rec(nums, begin + 1, end, result);
            swap(nums, begin, end);
        }


    }

    private void swap(int[] nums, int index, int swapIndex) {
        int temp = nums[index];
        nums[index] = nums[swapIndex];
        nums[swapIndex] = temp;
    }

    private void genneratePermutations(List<List<Integer>> result, int[] nums) {
        List<Integer> arrList = new ArrayList<>(nums.length);
        for (int num : nums) {
            arrList.add(num);
        }
        result.add(arrList);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = new Permutations().permute(nums);
        for (List<Integer> list : permute) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("===");
        }
    }
}
