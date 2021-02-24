package com.nerydlg.daily.coding.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int next = lower;
        for(int i = 0; i < nums.length; i++) {
            // to ignore previous values
            if(nums[i] < next){
                continue;
            }
            // increment by one one we found a number
            if(nums[i] == next){
                next++;
                continue;
            }
            // add range
            if(nums[i] > next) {
                result.add(rangeFormat(next, nums[i] - 1));
                next = nums[i] + 1;
            }
        }

        if(next <= upper) {
            result.add(rangeFormat(next, upper));
        }

        return result;
    }

    private String rangeFormat(int a, int b) {
        return (a == b)? a+"" : a +"->"+b;
    }
}
