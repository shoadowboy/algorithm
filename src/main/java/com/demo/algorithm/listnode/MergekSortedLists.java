package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

import java.util.List;
import java.util.PriorityQueue;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 */
public class MergekSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) {
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }
    //递归 可以考虑用最小堆
    public ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start == end - 1) {
            return mergeTwoListNode(lists[start], lists[end]);
        }
        int mid = (start + end) / 2;
        return mergeTwoListNode(mergeKLists(lists, start, mid), mergeKLists(lists, mid + 1, end));
    }

    /**
     * 合并两个链表
     * @param node1
     * @param node2
     * @return
     */
    private ListNode mergeTwoListNode(ListNode node1 ,ListNode node2){
        ListNode result =  new ListNode(0);
        ListNode temp =result;
        while (node1!=null&&node2!=null){
            if (node1.val>node2.val){
                temp.next = new ListNode(node2.val);
                node2 = node2.next;
            }else {
                temp.next = new ListNode(node1.val);
                node1 = node1.next;
            }
            temp = temp.next;
        }
        if (node1==null){
            temp.next = node2;
        }else {
            temp.next = node1;
        }

        return result.next;
    }

    public ListNode merge(){
      return  null;
    }
}
