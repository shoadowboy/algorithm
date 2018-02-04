package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 *  回文链表，快慢链表，找到链表对称中心，然后翻转后段链表
 * @author peichunle
 *
 */
public class PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
		if(head==null||head.next==null){
			return true;
		}
		ListNode fast = head.next.next;
		ListNode slow = head;
		while(fast!=null){
			slow = slow.next;
			if(fast.next!=null){
				fast = fast.next.next;
			}else{
				break;
			}
		}
		//翻转slow的next
		ListNode backHalfNode = reverseList(slow.next);
		while(backHalfNode!=null){
			if(backHalfNode.val!=head.val){
				return false;
			}
			backHalfNode= backHalfNode.next;
			head = head.next;
		}
		
        return true;
    }
	
	
	private static ListNode reverseList(ListNode head) {
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
		ListNode l3 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		System.out.println(isPalindrome(l1));
	}
}
