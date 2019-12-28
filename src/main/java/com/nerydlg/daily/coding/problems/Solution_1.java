package com.nerydlg.daily.coding.problems;
/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 **/

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class Solution_1 {

    public static int[] sum(int[] arr, int k) {
        
        Map<Integer, Integer> read = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            read.put(arr[i], arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
           int val = k - arr[i];
           if(read.containsKey(Integer.valueOf(val))) {
             return new int[]{arr[i], val};
           }
        }
        return null;
    }
} 
