package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringWithAtLessKTest {

    LongestStringWithAtLessK subject = new LongestStringWithAtLessK();

    @Test
    void FindLongestSubstringForAAABB() {
        String input = "aaabb";
        int k = 3;
        assertEquals(3, subject.longestSubstring(input,k));
    }
}