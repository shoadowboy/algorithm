package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * Given a binary search tree with non-negative values, 
 * find the minimum absolute difference between values of any two nodes.
 * Note: There are at least two nodes in this BST.
 * @author peichunle
 *思路：中序遍历，数字是从小到大递增，只需当前比较相邻元素绝对值差值是否比之前最小的小
 */
public class MinimumAbsoluteDifferenceinBST {
	static int min = Integer.MAX_VALUE;
    static Integer prev = null;

	public static int getMinimumDifference(TreeNode root) {

		if (root.left != null){
			getMinimumDifference(root.left);
		}
		if (prev != null) {
			min = Math.min(min, root.val - prev);
		}
		prev = root.val;
		if (root.right != null){
			getMinimumDifference(root.right);
		}

		return min;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		
		TreeNode t5 = new TreeNode(2);
		t1.right = t2;
		t2.left = t5;
		System.out.println(getMinimumDifference(t1));
	}
}
