package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * 节点比左右节点值都小，找到左侧子树,首节点肯定是最小的,
 * 找到左节点的最小的不等于根节点值的跟右节点最小的不等于跟节点的
 */
public class SecondMinimumNodeInaBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return findSecondValue(root, root.val);

    }

    //找到第一个不等于主节点的值
    private int findSecondValue(TreeNode node, int val) {
        if (node == null) {
            return -1;
        }
        if (node.val != val) {
            return node.val;
        } else {
            int left = findSecondValue(node.left, val);
            int right = findSecondValue(node.right, val);
            if (left == -1) {
                return right;
            }
            if (right == -1) {
                return left;
            }
            return Math.min(left, right);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        int secondMinimumValue = new SecondMinimumNodeInaBinaryTree().findSecondMinimumValue(root);
        System.out.println(secondMinimumValue);
    }

}
