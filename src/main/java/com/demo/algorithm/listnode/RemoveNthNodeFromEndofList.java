package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class RemoveNthNodeFromEndofList {
    /**
     * 快节点先走n步，然后两个节点同时向下走
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        int count = 1;
        while (first != null && count <= n) {
            first = first.next;
            count++;
        }
        if (first == null) {
            return head.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        ListNode listNode = removeNthFromEnd(l1, 1);
        System.out.println(listNode);

    }
}
