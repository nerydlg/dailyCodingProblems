package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    // add empty array always
    subsets.add(new ArrayList<>());
    // iterate over the nums array
    for(int i = 0; i < nums.length; i++) {
      List<List<Integer>> newSubset = new ArrayList<>();
      // generate new arrays based on the previous arrays
      for(List<Integer> curr: subsets) {
        List<Integer> newSet = new ArrayList<>(curr);
        newSet.add(nums[i]);
        newSubset.add(newSet);
      }
      // add events into the subset
      for(List<Integer> curr: newSubset ) {
        subsets.add(curr);
      }
    }
    return subsets;
  }
}
