package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null){
          return   minDepth(root.right)+1;
        }else if (root.right==null){
            return minDepth(root.left)+1;
        }else {
            int left =minDepth(root.left);
            int right = minDepth(root.right);
            return 1+Math.min(left,right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(54);
        root.right.right = new TreeNode(100);
        int i = new MinimumDepthofBinaryTree().minDepth(root);
        System.out.println(i);
    }
}
