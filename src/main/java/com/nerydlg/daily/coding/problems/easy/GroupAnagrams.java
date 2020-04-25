package com.nerydlg.daily.coding.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> words = new HashMap<>();
        String word = null;
        for(int i = 0; i < strs.length; i++) {
            word = sortString(strs[i]);

            if(words.containsKey(word)) {
                words.get(word).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                words.put(word, list);
            }
        }

        Set<String> keys = words.keySet();
        for(String k : keys) {
            result.add(words.get(k));
        }

        return result;
    }

    private String sortString(String str) {
        return Arrays.stream(str.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
