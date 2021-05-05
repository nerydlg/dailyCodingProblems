package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.ListNode;

public class PartitionList {

    public ListNode partitionList(ListNode head, int x) {
        // create two header one for lowers and one for highers
        // add a dummy node to prevent null pointer
        ListNode lower = new ListNode(0);
        ListNode lowerHead = lower;
        ListNode higher = new ListNode(0);
        ListNode higherHead = higher;
        // iterate over the list
        while(head != null) {
            // if value is lower it goes to the lower list
            if(head.val < x) {
                lower.next = head;
                lower = lower.next;
            } else {
                // otherwise it goes to the higher list
                higher.next = head;
                higher = higher.next;
            }
            head = head.next;
        }
        // remove the last link to head
        higher.next = null;
        // concatenate both lists
        lower.next = higherHead.next;
        // the result should have lowers at the beginning and
        // highers at the end.
        return lowerHead.next;
    }


}
