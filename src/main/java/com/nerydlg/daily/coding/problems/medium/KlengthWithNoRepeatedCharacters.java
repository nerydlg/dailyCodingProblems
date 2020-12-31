package com.nerydlg.daily.coding.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class KlengthWithNoRepeatedCharacters {

    public int numKLenSubstrNoRepeats(String s, int k){
        int start = 0, end = 0;
        int count = 0;
        if(s.length() < k ){
            return count;
        }
        int size = s.length();
        Set<Character> set = new HashSet<>();
        while(start < size - (k-1) && end < size) { // iterate until there is no more options
            if(set.size() < k) { // add more until reach k
                if(!set.contains(s.charAt(end))) {
                    set.add(s.charAt(end)); // [a]
                    end++;
                } else {
                    // already exists
                    while(set.contains(s.charAt(end))) {
                        set.remove(s.charAt(start));
                        start++;
                    }
                }
            } else { // one found!
                count++;
                set.remove(s.charAt(start));
                start++;
                //end++;
            }
        }
        if(end == size && set.size() == k) count++;
        return count;
    }
}