package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {

    public ListNode partitionList(ListNode head, int x) {
        ListNode lower = new ListNode(0);
        ListNode lowerHead = lower;
        ListNode higher = new ListNode(0);
        ListNode higherHead = higher;

        while(head != null) {
            if(head.val < x) {
                lower.next = head;
                lower = lower.next;
            } else {
                higher.next = head;
                higher = higher.next;
            }
            head = head.next;
        }
        higher.next = null;
        lower.next = higherHead.next;
        return lowerHead.next;
    }


}
