package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Four Sum same size same length
 */
public class FourSumSameSize {

  public int fourSumCount(int[] nums1, int[]nums2, int[]nums3, int[] nums4) {
    return kSumCount(new int[][]{nums1, nums2, nums3, nums4});
  }

  private int kSumCount(int[][] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    addToHash(nums, map, 0, 0);
    return countComponent(nums, map, nums.length / 2, 0);
  }

  private int countComponent(int[][] nums, Map<Integer, Integer> map, int i, int complement) {
    if(i == nums.length) {
      return map.getOrDefault(complement, 0);
    }

    int count = 0;
    for(int num : nums[i]) {
      count += countComponent(nums, map, i+1, complement - num);
    }
    return count;
  }

  private void addToHash(int[][] nums, Map<Integer, Integer> map, int i, int sum) {
    // if i is the half
    if(i == nums.length / 2) {
      // if sum is already in the map we just add one more to the count
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    } else {
      // for each num in the current row
      for(int num : nums[i]) {
        addToHash(nums, map, i+1, sum+num);
      }
    }
  }



}
