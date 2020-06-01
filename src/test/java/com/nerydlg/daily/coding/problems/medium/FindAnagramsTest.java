package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAnagramsTest {

    FindAnagrams findAnagrams = new FindAnagrams();

    @Test
    void findAnagram() {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> expected = Arrays.asList(0, 6);
        List<Integer> result = findAnagrams.findAnagrams(s, p);
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}