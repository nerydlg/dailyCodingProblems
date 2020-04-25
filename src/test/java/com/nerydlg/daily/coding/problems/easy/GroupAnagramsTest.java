package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class GroupAnagramsTest {

    private GroupAnagrams subject = new GroupAnagrams();
    @Test
    void anagramGroups() {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("ate","eat","tea"));
        expected.add(Arrays.asList("nat","tan"));
        expected.add(Arrays.asList("bat"));


        List<List<String>> result = subject.groupAnagrams(input);

        assertEquals(expected.size(), result.size());
        assertEquals(expected.get(0).size(), result.get(0).size());
    }
}