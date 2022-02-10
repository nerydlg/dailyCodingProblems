package com.nerydlg.daily.coding.problems.medium;

public class FindPeakNumber {
  /**
   * Finds the Peak element in the array by using
   * binary search.
   *
   * @param nums
   * @return
   */
  public int findPeakNumber(int[] nums) {
    int left = 0, right = nums.length - 1;
    int pivot = 0;
    while(left < right) {
      pivot = (left + right) / 2;
      if(nums[pivot] > nums[pivot + 1]) {
        right = pivot;
      } else {
        left = pivot + 1;
      }
    }
    return left;
  }
}
