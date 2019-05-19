package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

import java.util.List;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while(pre.next != null ){
            ListNode cur = pre.next;
            boolean isDup = false;
            while(cur.next != null && cur.val == cur.next.val){
                isDup = true;
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            }
            if (isDup){
                pre.next = cur.next;
                cur.next = null;
            }else {
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }


}
