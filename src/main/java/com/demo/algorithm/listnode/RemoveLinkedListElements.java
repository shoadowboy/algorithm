package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * @author peichunle
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * 思路：直接遍历，碰到相等值删掉这个节点,
 *
 */
public class RemoveLinkedListElements {
	public static ListNode removeElements(ListNode head, int val) {
		ListNode preNode = new ListNode(0);
		preNode.next = head;
		ListNode result = preNode;
		
		while(head!=null){
			if(head.val!=val){
				preNode.next = head;
				head = head.next;
				preNode = preNode.next;
			}else{
				preNode.next = null;
				head = head.next;
			}
			
		}
		return result.next;
			
    }
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(1);
		ListNode l6 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		ListNode node = removeElements(l1, 1);
		System.out.println(node);
	}
}
