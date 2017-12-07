package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

public class AddTwoSums {
//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
//	Explanation: 342 + 465 = 807.
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int[] a = new int[]{};
		ListNode result = new ListNode(0);
		boolean entryFlag = false;
		ListNode tmp = null;
		while(l1!=null||l2!=null){
			tmp = result.next;
			int ln1 = 0;
			int ln2 = 2;
			result.next = new ListNode((ln1+ln2)%10);
//			a.
			l1 = l1.next;
			l2 = l2.next;
		}
        return null;
    }
}
