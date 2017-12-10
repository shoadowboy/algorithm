package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

import javafx.scene.control.SplitPane.Divider;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other,
 *  some nodes of the two trees are overlapped while the others are not.
 *  You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
 *  then sum node values up as the new value of the merged node.
 *  Otherwise, the NOT null node will be used as the node of new tree.
 * @author peichunle
 *	思路:递归两树，如果其中一个为空，剩下所有节点为另一个树，不为空两树相加
 */
public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1==null){
			return  t2;
		}
		if(t2==null){
			return t1;
		}
		recursionTreeNodes(t1, t2);
        return t1;
    }
	
	private void recursionTreeNodes(TreeNode t1, TreeNode t2){
		if(t2==null){
			return ;
		}
		if(t1.left==null){
			t1.left = t2.left;
		}else{
			recursionTreeNodes(t1.left, t2.left);
		}
		if(t1.right==null){
			t1.right = t2.right;
		}else{
			recursionTreeNodes(t1.right, t2.right);
		}
		t1.val = t1.val+t2.val;
		
	}
}
