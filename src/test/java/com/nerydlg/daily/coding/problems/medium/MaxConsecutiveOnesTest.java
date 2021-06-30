package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes subject;

    @Test
    void findLongestConsecutiveOnes() {
        // GIVEN
        subject = new MaxConsecutiveOnes();
        int[] input = new int[]{1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        int k = 2;
        int expected = 6;
        // WHEN
        int actual = subject.longestOnes(input, k);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void findLongestConsecutiveOnes_2() {
        // GIVEN
        subject = new MaxConsecutiveOnes();
        int[] input = new int[]{0, 0, 0, 1, 1, 1};
        int k = 3;
        int expected = 6;
        // WHEN
        int actual = subject.longestOnes(input, k);
        // THEN
        assertEquals(expected, actual);
    }
}