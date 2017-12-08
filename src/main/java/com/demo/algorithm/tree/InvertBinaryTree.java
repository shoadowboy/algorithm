package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * 翻转二叉树
 * @author peichunle
 * 直接递归
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		invertTreeNodes(root);
		
		return root;
	}
	
	private void invertTreeNodes(TreeNode node){
		if(node==null){
			return ;
		}
		TreeNode tmp = node.left;
		node.left = node.right;
		node.right = tmp;
		invertTreeNodes(node.left);
		invertTreeNodes(node.right);
		return;
	}
}
