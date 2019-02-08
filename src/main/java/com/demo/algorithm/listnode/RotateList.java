package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 61. Rotate List
 */
public class RotateList {
    public  static ListNode rotateRight(ListNode head, int k) {
        ListNode result = new ListNode(0);
        if (k == 0||head==null) {
            return head;
        }
        int length = 0;
        ListNode l1 = head;
        while (l1 != null) {
            length++;
            l1 = l1.next;
        }
        int reverse =   k%length;
        if (reverse == 0) {
            return head;
        }
        // 从k的位置遍历 ，然后拼接头部
        int count = 1;
        result.next = head;
        int reverseIndex = length - reverse;
        result.next = head;
        while (count <= reverseIndex) {
            if (count < reverseIndex) {
                head = head.next;
            }else {
                //断开当前链表
                ListNode headNext = head.next;
                head.next = null;
                ListNode currentNext = result.next;
                result.next = headNext;
                ListNode reverseNode = headNext;
                while (reverseNode!=null){
                    if (reverseNode.next == null) {
                        reverseNode.next  = currentNext;
                        result.next = headNext;
                        break;
                    }
                    reverseNode= reverseNode.next;
                }
            }
            count++;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        ListNode current= head;
        for (int i = 2;i<=5;i++){
            current.next = new ListNode(i);
            current =current.next;
        }
        System.out.println(head);
        ListNode listNode = rotateRight(head, 4);
        System.out.println(listNode);
    }
}
