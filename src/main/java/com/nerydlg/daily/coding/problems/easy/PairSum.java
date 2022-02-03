package com.nerydlg.daily.coding.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements
 * within it which sum to k.
 * If an integer appears in the list multiple times, each copy is considered to be different;
 * that is, two pairs are considered different if one pair includes at least one array index which
 * the other doesn't, even if they include the same values.
 * Example 1
 * n = 5
 * k = 6
 * arr = [1, 2, 3, 4, 3]
 * output = 2
 * The valid pairs are 2+4 and 3+3.
 * Example 2
 * n = 5
 * k = 6
 * arr = [1, 5, 3, 3, 3]
 * output = 4
 */
public class PairSum {

    int numberOfWays(int[] arr, int k) {
        int n = arr.length;
        // create a map to store
        Map<Integer, Integer> numbersAndCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbersAndCount.containsKey(k - arr[i])) {
                count += numbersAndCount.get(k - arr[i]);
                System.out.println(k - arr[i] + ", " + arr[i]);
            }

            if (!numbersAndCount.containsKey(arr[i])) {
                numbersAndCount.put(arr[i], 1);
            }else{
                numbersAndCount.put(arr[i], numbersAndCount.get(arr[i])+1);
            }
        }
        return count;
    }

}
