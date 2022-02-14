package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {

  public int[][] intervalIntersection(int[][] arrA, int[][] arrB) {
    // create pointers for each arr
    int a = 0, b = 0;
    // result
    List<int[]> result = new ArrayList<>();
    // iterate over the two arrays
    while(a < arrA.length && b < arrB.length) {
      // get the minimum value from the second position
      int hi = Math.min(arrA[a][1], arrB[b][1]);
      // get the maximum value from the first position
      int lo = Math.max(arrA[a][0], arrB[b][0]);

      // add the result only if the position 1 is higher than position 0
      if(hi >= lo) {
        result.add(new int[]{lo, hi});
      }

      // advance the pointer in the one that end with higher number
      if(arrA[a][1] < arrB[b][1]) {
        a++;
      } else {
        b++;
      }
    }
    return result.toArray(new int[result.size()][]);
  }
}
