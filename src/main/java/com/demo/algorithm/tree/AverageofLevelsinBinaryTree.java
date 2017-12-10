package com.demo.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

import com.demo.algorithm.model.TreeNode;


/**
 * Given a non-empty binary tree, 
 * return the average value of the nodes on each level in the form of an array.
 * @author peichunle
 * Example Input:
    3
   / \
  9  20
    /  \
   15   7
   
 *
 *Output: [3, 14.5, 11]
 *思路：1 维护一个列表，记录当前已经计算的总和和不为空的数字个数,需要考虑int溢出情况
 */
public class AverageofLevelsinBinaryTree {
	public static List<Double> averageOfLevels(TreeNode root) {
		List<Double> sum = new ArrayList<Double>();
		List<Integer> num = new ArrayList<Integer>();
		recursionTreeNode(sum, num, root, 0);
		if(sum.size()==0){
			return new ArrayList<Double>(0);
		}
		List<Double> result = new ArrayList<Double>();
		for(int i=0;i<sum.size();i++){
			result.add(sum.get(i).doubleValue()/num.get(i).doubleValue());
		}
		return result;
    }
	
	private static void recursionTreeNode(List<Double> sum,List<Integer> num,TreeNode node, int level){
		if(node==null){
			return ;
		}
			
		if(level>=num.size()){
			num.add(level, 1);
			sum.add(level,new Integer(node.val).doubleValue());
		}else{
			num.set(level, num.get(level)+1);
			sum.set(level,sum.get(level)+new Integer(node.val).doubleValue());
		}
		recursionTreeNode(sum, num, node.left, level+1);
		recursionTreeNode(sum, num, node.right, level+1);
	}
	
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2147483647);
		TreeNode t3 = new TreeNode(2147483647);
		t1.left = t2;
		t1.right = t3;
		
		List<Double> averageOfLevels = averageOfLevels(t1);
		System.out.println(averageOfLevels);
	}
}
