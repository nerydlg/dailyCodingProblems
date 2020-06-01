package com.nerydlg.daily.coding.problems.medium;

public class LongestStringWithAtLessK {

    public int longestSubstring(String s, int k) {
        int n = s.length();
        if( k == 1) return n;
        if( k > n || n == 0) return 0;
        int count = 0;
        int[] alpha = new int[26]; // to hold all letters a = 0, z = 25;
        for(int i = 0; i < n; i ++) {
            char c = s.charAt(i);
            int lastCount = ++alpha[c - 'a']; // increment the letter count
            if(lastCount == 1) {
                count++;
            } else if(lastCount == k){
                count--;
            }
        }

        if(count == 0) return n;

        int max = 0;
        int j = 0, i = 0;
        while(j < n) {
            char ch = s.charAt(j);
            if(alpha[ch - 'a'] < k) {
                if(i != j) {
                    max = Math.max(max, longestSubstring(s.substring(i, j), k));
                }
                i = j + 1;
            }
            j++;
        }
        if(i != j)
            max = Math.max(max, longestSubstring(s.substring(i, j), k));
        return max;
    }
}
