package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 把链表拆成k份，计算链表总长，然后除k，余多少就说明前多少份要多一个元素
 * @author peichunle
 *
 */
public class SplitLinkedListinParts {
	public static ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] result = new ListNode[k];
		int totalcount = 0;
		ListNode head = root;
		while(head!=null){
			totalcount++;
			head = head.next;
		}
		int remain = totalcount%k;
		int nodeLength = totalcount/k;
		head = root;
		for(int i=0;i<k;i++){
			result[i] = new ListNode(0);
			int nowNodeLength = 1;
			result[i].next = head;
			if(head!=null){
				while(nowNodeLength<nodeLength){
					head = head.next;
					nowNodeLength++;
				}
				if(i<remain&&nodeLength!=0){
					head = head.next;
				}
				if(head!=null){
					ListNode tmp = head.next;
					head.next = null;
					head = tmp;
				}
				
			}
			result[i] = result[i].next;
		}
		return result;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode[] splitListToParts = splitListToParts(l1, 1);
		for (ListNode listNode : splitListToParts) {
			System.out.println(listNode);
		}
	}
}
