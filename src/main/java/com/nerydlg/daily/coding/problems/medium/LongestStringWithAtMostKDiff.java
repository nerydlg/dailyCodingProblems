package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithAtMostKDiff {
    /*
        This problem was asked by Amazon.

        Given an integer k and a string s, find the length of the longest
        substring that contains at most k distinct characters.

        For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".


     */
    public int longestSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0, j=0;
        int max = 0;
        while(i < s.length()) {
            Character ch = s.charAt(j);
            if(!map.containsKey(ch)) {
                map.put(ch, 1);
            }
            if(map.size() > k) {
                map.clear();
                max = Math.max(max, j - i);
                i++;
                j=i;
            } else {
                j++;
                if(j == s.length()) {
                    max = Math.max(max, j - i);
                    i++;
                    j=i;
                }
            }
        }
        return max;
    }
}
