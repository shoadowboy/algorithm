package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 翻转链表
 * @author peichunle
 *思路：直接遍历，把最新取出节点的下一个节点指向之前已经翻转过的
 */
public class ReverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		ListNode result = new ListNode(0);
		ListNode next = null;
		ListNode tmp = null;
		while(head!=null){
			next = result.next;
			tmp = head;
			head = head.next;
			result.next = tmp;
			result.next.next = next;
		}
        return result.next;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		ListNode reverseList = reverseList(l1);
		System.out.println(reverseList);
	}
}
