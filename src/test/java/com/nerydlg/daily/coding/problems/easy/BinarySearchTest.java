package com.nerydlg.daily.coding.problems.easy;

import com.sun.org.apache.bcel.internal.generic.FSUB;
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
}