package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * Given a binary search tree and the lowest and highest boundaries as L and R, 
 * trim the tree so that all its elements lies in [L, R] (R >= L). 
 * You might need to change the root of the tree, 
 * so the result should return the new root of the trimmed binary search tree.
 * Example 
 * Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1
 * @author peichunle
 * 思路：删除右节点大于R的右子树，删除左节点小于L的，节点在两个值中间的继续向下遍历，没有要求返回的树是平衡二叉树
 * 
 */
public class TrimaBinarySearchTree {
	public static TreeNode trimBST(TreeNode root, int L, int R) {
		
		return trimChild(root, L, R);
    }
	
	private static TreeNode trimChild(TreeNode root, int L, int R){
		if(root==null){
			return null;
		}
		if(root.val <L){
			return trimChild(root.right, L, R);
		}
		if(root.val>R){
			return trimChild(root.left, L, R);
		}else{
			root.right=trimChild(root.right, L, R);
			root.left=trimChild(root.left, L, R);
		}
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(0);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(4);
		t1.left = t2;
		t2.right = t3;
		t3.left = t4;
		t1.right = t5;
		
		TreeNode trimBST = trimBST(t1, 1, 4);
		System.out.println(trimBST);
	}
}
