package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberFromArrayTest {
    
    private LargestNumberFromArray subject;

    @BeforeEach
    void setUp() {
        subject = new LargestNumberFromArray();
    }

    @Test
    void LargestNumberWithThenAndTwo() {
        int[] input = {10, 2};
        String expected = "210";
        assertEquals(expected, subject.largestNumber(input));
    }

    @Test
    void LargestNumberWithMoreValues() {
        int[] input = {3,30,34,5,9};
        String expected = "9534330";
        assertEquals(expected, subject.largestNumber(input));
    }

    @Test
    void LargestNumberWithOnlyOne() {
        int[] input = {1};
        String expected = "1";
        assertEquals(expected, subject.largestNumber(input));
    }

    @Test
    void LargestNumberWithOnlyZeros() {
        int[] input = {0, 0, 0, 0};
        String expected = "0";
        assertEquals(expected, subject.largestNumber(input));
    }

}