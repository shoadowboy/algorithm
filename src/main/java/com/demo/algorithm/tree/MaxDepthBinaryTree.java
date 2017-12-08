package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * 树得最大深度
 * @author peichunle
 * 递归树
 *
 */
public class MaxDepthBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return left > right ? left+1 : right+1;
    }
	
	
}
