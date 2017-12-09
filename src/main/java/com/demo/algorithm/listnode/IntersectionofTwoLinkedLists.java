package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * @author peichunle
 *	Notes:
 *If the two linked lists have no intersection at all, return null.
 *The linked lists must retain their original structure after the function returns.
 *You may assume there are no cycles anywhere in the entire linked structure.
 *Your code should preferably run in O(n) time and use only O(1) memory.
 *思路：
 *1 不限制时间复杂度和空间复杂度 直接暴力枚举所有节点o（N*M） 空间复杂的o（1）
 *2 增加第一个链表的hash 时间复杂度o（m+n） 空间复杂度o（m）
 *3 先分别遍历两个链表的长度，m和n，计算差值，然后长的先枚举到长度差值点，然后两个链表同时枚举，如果有相同的说明有交集，否则没有
 */
public class IntersectionofTwoLinkedLists {
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode a = headA;
		ListNode b = headB;
		int lengtha = 0;
		int lengthb = 0;
		while (headA != null) {
			lengtha++;
			headA = headA.next;
		}
		while (headB != null) {
			lengthb++;
			headB = headB.next;
		}
//		if (lengtha == lengthb) {
//			// 长度相等只需要判断第一个节点是否相等
//			if (a == b) {
//				return a;
//			} else {
//				return null;
//			}
//		}
		if (lengtha < lengthb) {
			ListNode tmp = a;
			a = b;
			b = tmp;
			int tmpnum = lengtha;
			lengtha = lengthb;
			lengthb = tmpnum;
		}
		int D_value = lengtha - lengthb;
		int step = 0;
		while (a != null) {
			if (step < D_value) {
				a = a.next;
				step++;
			} else {
				if (a == b) {
					return a;
				} else {
					a = a.next;
					b = b.next;
				}
			}
		}

		return null;
    }
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
//		ListNode l5 = new ListNode(5);
//		ListNode l6 = new ListNode(6);
		l1.next = l3;
		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
//		l5.next = l6;
		
		ListNode intersectionNode = getIntersectionNode(l1, l3);
		System.out.println(intersectionNode);
		
	}
}
