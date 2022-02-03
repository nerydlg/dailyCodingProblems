package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConsecutiveSubArraysTest {

    ConsecutiveSubArrays subject;

    @Test
    void TestEasy() {
        // GIVEN
        subject = new ConsecutiveSubArrays();
        int[] input = { 3, 4, 1, 6, 2 };
        /**
         *  i = 0 -> [3]
         *  i = 1 -> [3,4] [4,1] [4]
         *  i = 2 -> [1]
         *  i = 3 -> [3, 4, 1, 6] [4, 1, 6][1,6][6][6,2]
         *  i = 4 -> [2]
         **/
        int[] expected = { 1, 3, 1, 5, 1 };
        // WHEN
        int[] actual = subject.countSubarrays(input);
        // THEN
        assertArrayEquals(expected, actual);
    }


    @Test
    void TestNormal() {
        // GIVEN
        subject = new ConsecutiveSubArrays();
        int[] input = { 1, 2, 8, 5, 3 };
        int[] expected = { 1, 2, 5, 2, 1 };
        // WHEN
        int[] actual = subject.countSubarrays(input);
        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void TestNormal_1() {
        // GIVEN
        subject = new ConsecutiveSubArrays();
        int[] input = { 5,4,1,2,6,3,7 };
        int[] expected = { 4,3,1,2,6,1,7 };
        // WHEN
        int[] actual = subject.countSubarrays(input);
        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwo() {
        // GIVEN
        subject = new ConsecutiveSubArrays();
        int[] input = { 2, 4, 7, 1, 5, 3 };
        int[] expected = { 1, 2, 6, 1, 3, 1 };
        // WHEN
        int[] actual = subject.countSubarrays(input);
        // THEN
        assertArrayEquals(expected, actual);
    }



}