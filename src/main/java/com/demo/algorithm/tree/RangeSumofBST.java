package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

public class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int L, int R) {

        TreeNode midNode = searchMidNode(root, L, R);
        int result = midNode.val;
        TreeNode rightNode = midNode.right;
        TreeNode leftNode = midNode.left;
        // 中间节点到右节点路径就是右半部分值
        while (true) {
            if (rightNode == null) {
                break;
            }
            if (rightNode.val == R) {
                result += rightNode.val;
                result += bst(rightNode.left);
                break;
            } else if (rightNode.val < R) {
                result += rightNode.val;
                result += bst(rightNode.left);
                rightNode = rightNode.right;
            } else {
                rightNode = rightNode.left;
            }

        }
        // 左侧需要找到左侧位置，以及左侧节点中大于L的所有节点
        while (true) {
            if (leftNode == null) {
                break;
            } else {
                if (leftNode.val == L) {
                    result += leftNode.val;
                    result += bst(leftNode.right);
                    break;
                } else if (leftNode.val > L) {
                    // 遍历右二叉树
                    result += bst(leftNode.right);
                    result += leftNode.val;
                    // 左侧节点继续向下遍历
                    leftNode = leftNode.left;
                } else {
                    leftNode = leftNode.right;
                }
            }
        }
        return result;
    }

    private TreeNode searchMidNode(TreeNode node, int L, int R) {
        if (node == null) {
            return null;
        }
        if (node.val >= L && node.val <= R) {
            return node;
        } else if (node.val < L) {
            return searchMidNode(node.right, L, R);
        } else {
            return searchMidNode(node.left, L, R);
        }
    }

    private int bst(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return node.val + bst(node.left) + bst(node.right);
        }
    }


    public static void main(String[] args) {
        int L = 7;
        int R = 10;
        TreeNode root = new TreeNode(10);
        TreeNode left1 = new TreeNode(5);
        TreeNode right1 = new TreeNode(15);
        root.left = left1;
        root.right = right1;
        left1.left = new TreeNode(3);
        left1.right = new TreeNode(7);
        right1.right = new TreeNode(18);
        int i = new RangeSumofBST().rangeSumBST(root, L, R);
        System.out.println(i);
    }
}
