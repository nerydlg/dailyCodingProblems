package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedArrayTest {

  private FindMinimumInRotatedArray subject;

  @Test
  void canFindMinimumElementInArray() {
    // GIVEN
    int[] nums = {3, 4, 5, 1, 2};
    int expected = 1;
    subject = new FindMinimumInRotatedArray();
    // WHEN
    int actual = subject.findMinBinarySearch(nums);
    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void canFindMinimumElementInArray_2() {
    // GIVEN
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int expected = 0;
    subject = new FindMinimumInRotatedArray();
    // WHEN
    int actual = subject.findMinBinarySearch(nums);
    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void canFindMinimumElementInArray_3() {
    // GIVEN
    int[] nums = {11, 13, 14, 15, 16};
    int expected = 11;
    subject = new FindMinimumInRotatedArray();
    // WHEN
    int actual = subject.findMinBinarySearch(nums);
    // THEN
    assertEquals(expected, actual);
  }
}