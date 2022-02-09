package com.nerydlg.daily.coding.problems.medium;

public class FindMinimumInRotatedArray {

  /**
   * Linear Solution it detects when the value goes negative
   * if it doesn't then the array is not rotated with means minimum is at the beginning
   * @param nums
   * @return
   */
  public int findMin(int[] nums) {
    for(int i = 0; i < nums.length-1; i++) {
      if(nums[i+1] - nums[i] < 0) {
        return nums[i+1];
      }
    }
    return nums[0];
  }

  /**
   * Logarithmic solution uses binary search to found the minor element
   * @param nums
   * @return
   */
  public int findMinBinarySearch(int[] nums) {
    // if there is only one element return this
    if(nums.length == 1) {
      return nums[0];
    }

    int left = 0, right = nums.length - 1, pivot = 0;
    // if most left element is less than the most right value then array is not rotated
    if(nums[left] < nums[right]) {
      return nums[0];
    }

    // binary search
    while(left <= right) {
      pivot = (left + right) / 2;
      // if the current pivot is minor than the next value
      // that means we detected the drop
      if(nums[pivot] > nums[pivot + 1]) {
        return nums[pivot + 1];
      }
      // check if the left element is not higher than the pivot
      if(nums[pivot - 1] > nums[pivot]) {
        return nums[pivot];
      }

      // verify if current pivot is higher than left
      if(nums[pivot] > nums[left]) {
        left = pivot + 1;
      } else {
        right = pivot - 1;
      }
    }
    return -1;
  }
}
