package com.nerydlg.daily.coding.problems.medium;


import com.nerydlg.daily.coding.problems.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PartitionListTest {

    private PartitionList subject;

    @Test
    void canPartitionListByThree() {
        // GIVEN
        subject = new PartitionList();
        ListNode head = ListNode.serialize(new int[]{1, 4, 3, 2, 5, 2});
        Integer[] expected = new Integer[]{1, 2, 2, 4, 3, 5};

        // WHEN
        ListNode result = subject.partitionList(head, 3);
        Integer[] actual = ListNode.deserialize(result);
        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void canPartitionListByFive() {
        // GIVEN
        subject = new PartitionList();
        ListNode head = ListNode.serialize(new int[]{1, 4, 3, 2, 5, 2});
        Integer[] expected = new Integer[]{1, 4, 3, 2, 2, 5};

        // WHEN
        ListNode result = subject.partitionList(head, 5);
        Integer[] actual = ListNode.deserialize(result);
        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void canPartitionListByTwo() {
        // GIVEN
        subject = new PartitionList();
        ListNode head = ListNode.serialize(new int[]{2, 1});
        Integer[] expected = new Integer[]{1, 2};

        // WHEN
        ListNode result = subject.partitionList(head, 2);
        Integer[] actual = ListNode.deserialize(result);
        // THEN
        assertArrayEquals(expected, actual);
    }
}