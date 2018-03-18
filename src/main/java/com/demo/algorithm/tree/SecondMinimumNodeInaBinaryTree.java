package com.demo.algorithm.tree;

import com.demo.algorithm.model.TreeNode;

/**
 * 节点比左右节点值都小，找到左侧子树,首节点肯定是最小的,
 * 找到左节点的最小的不等于根节点值的跟右节点最小的不等于跟节点的
 *
 */
public class SecondMinimumNodeInaBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
               return -1;
        }

        int smallest = root.val;
        int secondSmall =smallest;
        if(root.left!=null&&root.right!=null){
            int left =  searchMinvalue(root.left,smallest);
            int right = searchMinvalue(root.right,smallest);
            if(left==smallest){
                secondSmall=left;
            }else{
                secondSmall =right;
            }

        } else if(root.left!=null){
            secondSmall=  searchMinvalue(root.left,smallest);
        }else if(root.right!=null){
            secondSmall=  searchMinvalue(root.right,smallest);
        }


        if(smallest!=secondSmall){
            return secondSmall;
        }
        return -1;
    }


    private int searchMinvalue(TreeNode node ,int targetValue){
        if(node.val==targetValue){
            if(node.left!=null&&node.right!=null){
                int left =  searchMinvalue(node.left,targetValue);
                int right = searchMinvalue(node.right,targetValue);
                if(left==targetValue){
                    return left;
                }else{
                    return right;
                }
            } else if(node.left!=null){
                return searchMinvalue(node.left,targetValue);
            }else if(node.right!=null){
                return searchMinvalue(node.right,targetValue);
            }
        }
        return node.val;
    }


}
