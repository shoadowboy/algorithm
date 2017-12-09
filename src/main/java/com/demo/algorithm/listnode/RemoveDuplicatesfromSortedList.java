package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 删除排序链表的重复节点
 * @author peichunle
 * 思路：直接遍历，下一个节点和当前节点值一致删除下一个节点
 */
public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
        ListNode result = head;
        while(head.next !=null){
        	if(head.val ==head.next.val){
        		head.next = head.next.next;
        	}else{
        		head = head.next;
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode reverseList = deleteDuplicates(l1);
		System.out.println(reverseList);
	}
}
