package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void numberExists() {
        BinarySearch subject = new BinarySearch();
        int[] input = new int[]{-9, 14, 37, 102};
        int k = 102;
        assertTrue(subject.exists(input, k));
        assertTrue(subject.exists(input, -9));
        assertFalse(subject.exists(input, 36));
    }

    @Test
    void numberExists_2() {
        BinarySearch subject = new BinarySearch();
        int[] input = new int[]{1, 2, 3, 4, 6};
        int k = 5;
        assertFalse(subject.exists(input, k));
    }
}