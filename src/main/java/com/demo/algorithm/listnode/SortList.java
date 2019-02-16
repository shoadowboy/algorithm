package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 归并排序
 * 链表排序
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode fast = head;
        ListNode slow = head;
        ListNode left =head;
        ListNode tmp = head;
        int  mid = 0;
        while (fast != null && fast.next != null) {
            mid++;
            slow = slow.next;
            fast = fast.next.next;
        }
        return result;
    }

    private ListNode getMidNode(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        ListNode left =node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //todo
    private void sortNode(ListNode node){
        if (node==null||node.next==null){
            return;
        }
        ListNode midNode = getMidNode(node);


    }

}
