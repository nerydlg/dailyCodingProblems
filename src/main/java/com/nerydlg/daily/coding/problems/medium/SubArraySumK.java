package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {

  /**
   * Finds the number of subsets in array that sum up to K
   * @param nums
   * @param k
   * @return
   */
  public int subArraySum(int[] nums, int k) {
    int sum = 0, result = 0;
    Map<Integer, Integer> cumulativeSums =new HashMap<>();
    cumulativeSums.put(0, 1);
    for(int i = 0; i < nums.length; i++) {
      // add the next element into the sum
      sum += nums[i];
      if(cumulativeSums.containsKey(sum - k)) {
        result +=  cumulativeSums.get(sum - k);
      }
      cumulativeSums.put(sum, cumulativeSums.getOrDefault(sum, 0) + 1);
    }
    return result;
  }
}
