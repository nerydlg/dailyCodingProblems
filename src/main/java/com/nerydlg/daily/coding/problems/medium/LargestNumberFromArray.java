package com.nerydlg.daily.coding.problems.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumberFromArray {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
                .mapToObj(Integer::toString) // convert int to String
                .sorted((a, b) -> (b+a).compareTo(a+b) > 0 ? 1 : -1)  // custom comparator to compare values concatenated
                .collect(Collectors.joining(""));  // merge values into a single string
        if(result.charAt(0) == '0') {
            return "0";
        } else {
            return result;
        }
    }
}
