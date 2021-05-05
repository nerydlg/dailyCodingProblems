package com.nerydlg.daily.coding.problems.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {

    }

    public static ListNode serialize(int[] values) {
        ListNode curr = new ListNode(0);
        ListNode head = curr;
        for(int i = 0; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head.next;
    }

    public static Integer[] deserialize(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }
        return result.toArray(new Integer[result.size()]);
    }
}
