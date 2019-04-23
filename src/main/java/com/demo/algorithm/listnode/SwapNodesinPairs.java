package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode result = new ListNode(0);
        ListNode tmp = head.next.next;
        result.next = head.next;
        result.next.next = head;
        head.next = null;
        ListNode currenEnd = result.next.next;
        while (tmp!=null){
            if (tmp.next ==null){

            }
        }
        return result.next;
    }
}
