package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairSumTest {

    PairSum subject;

    @Test
    void canFindSumSampleOne() {
        // GIVEN
        int[] input = {1, 2, 3, 4, 5};
        int k = 6;
        int expected = 2;
        subject = new PairSum();
        // WHEN
        int actual = subject.numberOfWays(input, k);
        assertEquals(expected, actual);
    }


    @Test
    void canFindSumSampleTwo() {
        // GIVEN
        int[] input = {1, 5, 3, 3, 3};;
        int k = 6;
        int expected = 4;
        subject = new PairSum();
        // WHEN
        int actual = subject.numberOfWays(input, k);
        assertEquals(expected, actual);
    }

    @Test
    void canFindSumSampleThree() {
        // GIVEN
        int[] input = {1, 2, 4, 3, 1};;
        int k = 5;
        int expected = 3;
        subject = new PairSum();
        // WHEN
        int actual = subject.numberOfWays(input, k);
        assertEquals(expected, actual);
    }

    @Test
    void canFindSumSampleLarge() {
        // GIVEN
        int[] input = {1, 3, 4, 3, 4, 3, 1, 4, 3, 4, 5, 6};;
        int k = 7;
        int expected = 18;
        subject = new PairSum();
        // WHEN
        int actual = subject.numberOfWays(input, k);
        assertEquals(expected, actual);
    }
}