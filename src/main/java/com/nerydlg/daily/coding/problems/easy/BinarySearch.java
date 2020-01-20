package com.nerydlg.daily.coding.problems.easy;

public class BinarySearch {

    public boolean exists(int[] input, int k) {
        if(input == null || input.length == 0) {
            return false;
        }
        int start = 0;
        int end = input.length;
        int target = (end - start) / 2;
        boolean found = false;
        while(end > start) {
            if(input[start + target] > k) {
                end = target;
            } else if(input[start + target] < k) {
                start = target+1;
            } else {
                found = true;
                break;
            }
            target = (end - start) / 2;
        }
        return found;
    }

}
