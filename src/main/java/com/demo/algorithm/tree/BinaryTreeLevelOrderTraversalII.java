package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal
 * of its nodes' values. (ie, from left to right, level by level from leaf to root)
 * 打印统计节点
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

        search(root,result,0);

        return result;
    }

    private void search(TreeNode node, LinkedList<List<Integer>> list,int level){
        if (node==null){
            return ;
        }else{
            if(list.size()<level+1){
                list.addFirst(new LinkedList<Integer>());
            }
            list.get(list.size()-1-level).add(node.val);
            search(node.left,list,level+1);
            search(node.right,list,level+1);

        }
    }

}
