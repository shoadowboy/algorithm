package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode result = buildLeft(nums,0,nums.length-1);
        return result;
    }
    private int searchMaxNumIndex(int begin,int end ,int[] nums){
        int max = nums[begin];
        int maxIndex =begin;
        for (int i=begin;i<=end;i++){
            if (nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private TreeNode buildLeft(int[] nums,int begin,int end){
        if (begin>end||begin>nums.length-1){
            return null;
        }else if (begin==end){
            return new TreeNode(nums[begin]);
        }
        int i = searchMaxNumIndex(begin, end, nums);
        TreeNode node = new TreeNode(nums[i]);
        node.left = buildLeft(nums,begin,i-1);
        node.right = buildLeft(nums,i+1,end);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        TreeNode node = new MaximumBinaryTree().constructMaximumBinaryTree(nums);
        System.out.println(node);
    }
}
