package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiffPairsInAnArrayTest {

  private DiffPairsInAnArray subject;

  @Test
  void canFindPairs() {
    // GIVEN
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;
    int expectedResult = 2;
    subject = new DiffPairsInAnArray();
    // WHEN
    int actual = subject.findPairs(nums, k);
    // THEN
    assertEquals(expectedResult, actual);
  }

  @Test
  void canFindPairsTwo() {
    // GIVEN
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;
    int expectedResult = 1;
    subject = new DiffPairsInAnArray();
    // WHEN
    int actual = subject.findPairs(nums, k);
    // THEN
    assertEquals(expectedResult, actual);
  }
}