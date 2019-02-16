package com.demo.algorithm.listnode;

import com.demo.algorithm.model.ListNode;

public class AddTwoNumbersII {
    /**
     * todo 后面看下栈会不会更快点
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1temp = l1;
        ListNode l2temp = l1;
        int l1Length = getListNodeLength(l1);
        int l2Length = getListNodeLength(l2);

        // 判断l1 length和 l2中较大的
        if (l1Length < l2Length) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        int current = 0;
        int diff = Math.abs(l1Length - l2Length);
        ListNode result = l1;
        int addNum = buidNode(l1, l2, diff, current);

        if (addNum > 0) {
            ListNode listNode = new ListNode(addNum);
            listNode.next = l1;
            return listNode;
        }
        return l1;
    }

    private int getListNodeLength(ListNode node){
        ListNode temp = node;
        int length =0;
        while (node!=null){
            length++;
            node = node.next;
        }
        return length;
    }

    private int buidNode(ListNode l1, ListNode l2, int diff, int current) {
        if (l1 == null && l1 == null) {
            return 0;
        }
        int temp = 0;

        if (current < diff) {
            temp = l1.val + buidNode(l1.next, l2, diff, current + 1);
        } else {
            temp = l1.val + l2.val + buidNode(l1.next, l2.next, diff, current + 1);
        }
        if (temp >= 10) {
            l1.val = temp % 10;
        }else {
            l1.val=temp;
        }
        return temp / 10;
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 4, 3};
        ListNode l1 = builtListNode(nums);
        int[] nums2 = {5, 6, 4};
        ListNode l2 = builtListNode(nums2);

        ListNode listNode = new AddTwoNumbersII().addTwoNumbers(l2, l1);
        System.out.println(listNode);


    }

    public static ListNode builtListNode(int[] nums) {
        ListNode result = new ListNode(0);
        result.next = new ListNode(nums[0]);
        ListNode temp = result.next;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        return result.next;
    }

}
