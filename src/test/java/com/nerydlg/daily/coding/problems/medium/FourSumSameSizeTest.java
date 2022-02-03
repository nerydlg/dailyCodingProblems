package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSumSameSizeTest {

  private FourSumSameSize subject;

  @Test
  void canSum4() {
    // GIVEN
    subject = new FourSumSameSize();
    int[] nums1 = {1, 2};
    int[] nums2 = {-2, -1};
    int[] nums3 = {-1, 2};
    int[] nums4 = {0, 2};

    int expected = 2;
    // WHEN
    int actual = subject.fourSumCount(nums1, nums2, nums3, nums4);
    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void canSum4Two() {
    // GIVEN
    subject = new FourSumSameSize();
    int[] nums1 = {1, -1};
    int[] nums2 = {-1, 1};
    int[] nums3 = {1, -1};
    int[] nums4 = {-1 , 1};

    int expected = 6;
    // WHEN
    int actual = subject.fourSumCount(nums1, nums2, nums3, nums4);
    // THEN
    assertEquals(expected, actual);
  }
}