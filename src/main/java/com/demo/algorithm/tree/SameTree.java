package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical 
 * and the nodes have the same value.
 * @author peichunle
 *思路：同时遍历两棵树，如果节点不同返回false
 */
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null){
			return true;
		}else if(p!=null&&q!=null){
			if(p.val != q.val){
				return false;
			}
			if(!isSameTree(p.left, q.left)){
				return false;
			}
			if(!isSameTree(p.right, q.right)){
				return false;
			}
		}else{
			return false;
		}
        return true;
    }
	
}
