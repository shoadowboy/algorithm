package com.demo.algorithm.model;

/**
 * 链表结构
 * @author peichunle
 *
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	
	
}
