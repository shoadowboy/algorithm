package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

/**
 * 归并排序
 * 链表排序
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        return head == null ? null : sortNode(head);
    }

    private ListNode sortNode(ListNode head){
        if (head.next == null) {
            return head;
        }
        ListNode p = head, q = head, pre = null;
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = sortNode(head);
        ListNode r = sortNode(p);
        return mergeNode(l, r);
    }

    private ListNode mergeNode(ListNode l1,ListNode l2){
        ListNode r = new ListNode(0);
        ListNode pre = r;
        ListNode cur = r.next;

        /*遍历双链表，一个为空，把剩下的直接放到合并的链表后面
         * 具体流程，判断l1<=l2是否成立，成立的话，cur=l1，.next=cur; cur=cur.next;
         */
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur = l2;
                l2 = l2.next;
                pre.next = cur;
            } else {
                cur = l1;
                pre.next = cur;
                l1 = l1.next;
            }
            pre = cur;
        }
        // 判断l2是否为空
        if (l2 != null) {
            cur = l2;
            pre.next = cur;
        }
        if (l1 != null) {
            cur = l1;
            pre.next = cur;
        }
        return r.next;
    }

}
