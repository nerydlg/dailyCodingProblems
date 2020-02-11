package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringWithAtMostKDiffTest {

    private LongestStringWithAtMostKDiff subject = new LongestStringWithAtMostKDiff();

    @Test
    void LongestStringWithAtMostTwoDifferentLetters() {
        String input = "abcba";
        int k = 2;

        int actual = subject.longestSubstring(input, k);

        assertEquals(3, actual);
    }

    @Test
    void LongestStringWithAtMostFourDifferentLetters() {
        String input = "skfjsldfjlsdfjwoierjwoieroweijofwoieeeieeieei";
        int k = 4;

        int actual = subject.longestSubstring(input, k);

        assertEquals(13, actual);
    }

    @Test
    void LongestStringWithAtMostFourDifferentLettersInAWordComposedOfFourLetters() {
        String input = "woieeeieeieei";
        int k = 4;

        int actual = subject.longestSubstring(input, k);

        assertEquals(13, actual);
    }

    @Test
    void LongestStringWithAtMostFourDifferentLettersInAWordOf2() {
        String input = "ie";
        int k = 4;

        int actual = subject.longestSubstring(input, k);

        assertEquals(2, actual);
    }

    @Test
    void LongestStringWithAtMostFourDifferentLettersInAEmptyWord() {
        String input = "";
        int k = 4;

        int actual = subject.longestSubstring(input, k);

        assertEquals(0, actual);
    }
}