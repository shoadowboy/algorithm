package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

public class ListNodeInsertSort {
	/**
	 * 第一种，类似于数组进行冒泡排序
	 * 
	 * @param head
	 * @return
	 */
	public ListNode insertionSortList(ListNode head) {
		// write your code here
		return null;
	}

	/**
	 * 维护双链表,只需遍历一次
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode insertionSortList2(ListNode head) {
		ListNode sortresult = new ListNode(0);
		while (head != null) {
			ListNode tmpSortreSult = sortresult;
			ListNode tmp =  head.next;
			//把当前节点变成单节点
			head.next = null;
			while (tmpSortreSult!=null){
				if(tmpSortreSult.next == null){
					tmpSortreSult.next = head;
					break;
				}
				if(tmpSortreSult.next.val>head.val){
					head.next =  tmpSortreSult.next;
					tmpSortreSult.next = head;
					break;
				}
				tmpSortreSult = tmpSortreSult.next;
			}
			head = tmp;
		}
		return sortresult.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(0);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		ListNode node = insertionSortList2(l1);
		while(node!=null){
			System.out.println(node);
			node = node.next;
		}
	}
}
