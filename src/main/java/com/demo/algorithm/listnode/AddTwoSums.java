package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

public class AddTwoSums {
//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
//	Explanation: 342 + 465 = 807.
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode tmp = result;
		int add = 0;
		while(l1!=null||l2!=null){
			int l1tmpVal =0;
			int l2tmpVal =0;
			if (l1 !=null){
				l1tmpVal= l1.val;
				l1 = l1.next;
			}
			if (l2!=null){
				l2tmpVal=l2.val;
				l2=l2.next;
			}
			int tmpval = l1tmpVal+l2tmpVal+add;
			if (tmpval>=10){
				add = tmpval/10;
				tmpval = tmpval%10;
			}else {
				add=0;
			}
			tmp.next =new ListNode(tmpval);
			tmp = tmp.next;
		}
		if (add!=0){
			tmp.next = new ListNode(add);
		}
        return result.next;
    }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next =new ListNode(8);
		ListNode l2 =new ListNode(0);
		ListNode listNode = addTwoNumbers(l1, l2);
		System.out.println(listNode);

	}
}
