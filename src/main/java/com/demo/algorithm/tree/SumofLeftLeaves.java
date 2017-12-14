package com.demo.algorithm.tree;

import javax.sql.rowset.RowSetProvider;

import com.demo.algorithm.model.TreeNode;

/**
 * Find the sum of all left leaves in a given binary tree.
 * @author peichunle
 *思路：递归遍历，直到左节点的left为空，然后加上该元素
 */
public class SumofLeftLeaves {
	public static int sumOfLeftLeaves(TreeNode root) {
		 if(root == null){
	            return 0;
	        }
	        int sum = 0;
	        if(root.left != null && root.left.left == null && root.left.right == null){
	            sum += root.left.val;
	        }
	        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
	

	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		
//		TreeNode t1 = new TreeNode(1);
//		TreeNode t2 = new TreeNode(2);
//		TreeNode t3 = new TreeNode(4);
//		TreeNode t4 = new TreeNode(5);
//		TreeNode t5 = new TreeNode(3);
//		t1.left = t2;
//		t1.right = t5;
//		t2.left = t3;
//		t2.right = t4;
		
		
		
//		TreeNode t1 = new TreeNode(1);
//		TreeNode t2 = new TreeNode(2);
//		TreeNode t3 = new TreeNode(4);
//		TreeNode t4 = new TreeNode(5);
//		TreeNode t5 = new TreeNode(3);
//		t1.left = t2;
//		t1.right = t5;
//		t2.left = t3;
//		t2.right = t4;
		
		int sumOfLeftLeaves = sumOfLeftLeaves(t1);
		System.out.println(sumOfLeftLeaves);
	}
}
