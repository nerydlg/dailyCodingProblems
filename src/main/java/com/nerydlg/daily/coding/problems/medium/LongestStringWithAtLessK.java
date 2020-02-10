package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestStringWithAtLessK {

    public int longestSubstring(String s, int k) {
        Map<Character, Integer> map = mapAllLetters(s, k);
        if(map.isEmpty()) return 0;
        int maxLength = 0;
        for(int i=0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(map.containsKey(ch)) {
                maxLength++;
            }
        }
        return maxLength;
    }

    public Map<Character, Integer> mapAllLetters(String s, int k) {
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        return map.entrySet().stream()
                .filter(entry -> entry.getValue().compareTo(k) >= 0)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
    }
}
