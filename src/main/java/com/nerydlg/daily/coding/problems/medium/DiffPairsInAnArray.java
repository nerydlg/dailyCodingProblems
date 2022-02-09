package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class DiffPairsInAnArray {

  public int findPairs(int[] nums, int k) {
    int result = 0;
    Map<Integer, Integer> frequency = new HashMap<>();

    // create map with frequency of each number
    for(int i = 0; i < nums.length; i++) {
      frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
    }
    // for each number in the map we are going to look for its counterpart
    for(Map.Entry<Integer, Integer> eachNumber : frequency.entrySet()) {
      int key = eachNumber.getKey();
      int val = eachNumber.getValue();
      // look if the key + k = pair if exsits increase the count
      if(k > 0 && frequency.containsKey(key + k)) {
        result++;
      } else if(k == 0 && val > 1) { // or if k = 0 then look for the same number
        result++;
      }
    }
    return result;
  }
}
