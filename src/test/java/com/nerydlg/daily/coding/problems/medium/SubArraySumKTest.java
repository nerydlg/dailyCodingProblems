package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubArraySumKTest {

  SubArraySumK subject;

  @Test
  void canFindConsecutiveSumInSubArrays() {
    // GIVEN
    int k = 2;
    int[] nums = {1, 1, 1};
    int expected = 2;
    subject = new SubArraySumK();
    // WHEN
    int actual = subject.subArraySum(nums, k);
    // THEN
    assertEquals(actual, expected);
  }

  @Test
  void canFindConsecutiveSumInSubArrays_2() {
    // GIVEN
    int k = 3;
    int[] nums = {1, 2, 3};
    int expected = 2;
    subject = new SubArraySumK();
    // WHEN
    int actual = subject.subArraySum(nums, k);
    // THEN
    assertEquals(actual, expected);
  }

  @Test
  void canFindConsecutiveSumInSubArrays_3() {
    // GIVEN
    int k = 3;
    int[] nums = {1, 2, 2, 2, 1, 3, 4, 6};
    int expected = 3;
    subject = new SubArraySumK();
    // WHEN
    int actual = subject.subArraySum(nums, k);
    // THEN
    assertEquals(actual, expected);
  }
}