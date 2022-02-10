package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPeakNumberTest {

  FindPeakNumber subject;

  @Test
  void canFindPickInArray() {
    // GIVEN
    int[] nums = { 1, 2, 4, 5, 8, 9, 16, 77, 95, 106, 546, 104, 98, 85, 85, 75, 67, 57, 6, 5 };
    int expected = 546;
    subject = new FindPeakNumber();
    // WHEN
    int actual = subject.findPeakNumber(nums);
    // THEN
    assertEquals(expected, nums[actual]);
  }

  @Test
  void canFindPickInSmallArray() {
    // GIVEN
    int[] nums = {1, 2, 3, 1};
    int expected = 3;
    subject = new FindPeakNumber();
    // WHEN
    int actual = subject.findPeakNumber(nums);
    // THEN
    assertEquals(expected, nums[actual]);
  }

  @Test
  void canFindPickInMediumArray() {
    // GIVEN
    int[] nums = {1,2,1,3,5,6,4};
    int expected = 6;
    subject = new FindPeakNumber();
    // WHEN
    int actual = subject.findPeakNumber(nums);
    // THEN
    assertEquals(expected, nums[actual]);
  }
}