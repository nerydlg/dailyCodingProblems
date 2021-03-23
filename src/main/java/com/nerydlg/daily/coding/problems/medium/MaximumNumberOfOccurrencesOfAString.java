package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfOccurrencesOfAString {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
        int left = 0;
        int right = 0;
        Map<String, Integer> counts = new HashMap<>();
        int max = 0;
        // iterate all over the string doing sliding window of minSize
        while(left < (n - minSize) + 1) {
            right = left + minSize;
            String curr = s.substring(left, right);
            // check if substring does not contains more than maxLetters different values
            if(isValid(curr, maxLetters)) {
                // add the string to the map if it is already there add 1
                counts.put(curr, counts.getOrDefault(curr, 0)+1);
                // compare our current max with the last value from the map
                max = Math.max(counts.get(curr), max);
            }
            // move left
            left++;
        }
        return max;
    }

    private boolean isValid(String str, int maxLetters) {
        // this is the alphabet
        int[] letters = new int[26];
        int distinct = 0;
        int n = str.length();
        for(int i = 0; i < n; i++) {
            // verify if it was zero before to increase value
            if(letters[str.charAt(i) - 'a']++ == 0){
                distinct++;
            }
        }
        return distinct <= maxLetters;
    }
}
