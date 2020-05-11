package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class FindWaysToGetAWord {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int howManyWaysToGetAWord(String numeric) {
        if(numeric == null || numeric.length() == 0) {
            return 0;
        }
        return howManyWaysToGetAWord(0, numeric);
    }

    public int howManyWaysToGetAWord(int index, String numeric) {
        if(index == numeric.length()) {
            return 1;
        }

        if(numeric.charAt(index) == '0') {
            return 0;
        }

        if(index == numeric.length() - 1) {
            return 1;
        }

        if(memo.containsKey(index)) {
            return memo.get(index);
        }

        int result = howManyWaysToGetAWord(index + 1, numeric);
        if(Integer.valueOf(numeric.substring(index, index+2)) <= 26) {
            result += howManyWaysToGetAWord(index+2, numeric);
        }
        memo.put(index, result);
        return result;
    }
}
