package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 * @author peichunle
 * 追击问题，快慢节点
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if(head==null){
			return  false;
		}
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null){
        	if(fast == slow ){
        		return true;
        	}
        	if(fast.next == null){
        		return false;
        	}
        	fast = fast.next.next;
        	slow = slow.next;
        }
		return false;
    }
}
