package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfOccurrencesOfAStringTest {

    MaximumNumberOfOccurrencesOfAString subject = new MaximumNumberOfOccurrencesOfAString();

    @Test
    void givenAStringAShouldReturnTwo() {
        // GIVEN
        String s = "aababcaab";
        int maxLetters = 2;
        int minSize = 3;
        int maxSize = 4;
        int expected = 2;
        // WHEN
        int actual = subject.maxFreq(s, maxLetters, minSize, maxSize);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void givenAStringBShouldReturnTwo() {
        // GIVEN
        String s = "aaaa";
        int maxLetters = 1;
        int minSize = 3;
        int maxSize = 3;
        int expected = 2;
        // WHEN
        int actual = subject.maxFreq(s, maxLetters, minSize, maxSize);
        // THEN
        assertEquals(expected, actual);
    }


    @Test
    void givenAStringCShouldReturnThree() {
        // GIVEN
        String s = "aabcabcab";
        int maxLetters = 2;
        int minSize = 2;
        int maxSize = 3;
        int expected = 3;
        // WHEN
        int actual = subject.maxFreq(s, maxLetters, minSize, maxSize);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void givenAStringCShouldReturnZero() {
        // GIVEN
        String s = "abcde";
        int maxLetters = 2;
        int minSize = 3;
        int maxSize = 3;
        int expected = 0;
        // WHEN
        int actual = subject.maxFreq(s, maxLetters, minSize, maxSize);
        // THEN
        assertEquals(expected, actual);
    }

}