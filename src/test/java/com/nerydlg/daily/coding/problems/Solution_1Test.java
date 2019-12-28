package com.nerydlg.daily.coding.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1Test {

    private Solution_1 subject = new Solution_1();

    @Test
    void sumNotExists() {
        int[] input = new int[]{ 10, 15, 3, 7};
        int k = 21;
        assertNull(subject.sum(input, k));
    }

    @Test
    void sumExists() {
        int[] input = new int[]{ 10, 11, 3, 7 };
        int[] expected = new int[]{ 10, 11 };
        int k = 21;
        assertArrayEquals(expected, subject.sum(input, k));
    }
}