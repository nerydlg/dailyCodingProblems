package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubsetsTest {

  Subsets subject;
  @Test
  void canGenerateSubsets() {
    // GIVEN
    int[] nums = {1, 2, 3};
    subject = new Subsets();
    List<List<Integer>> expected = List.of(
        List.of(),
        List.of(1),
        List.of(2),
        List.of(1, 2),
        List.of(3),
        List.of(1, 3),
        List.of(2, 3),
        List.of(1, 2, 3)
        );
    // WHEN
    List<List<Integer>> actual = subject.subsets(nums);
    // THEN
    assertEquals(expected, actual);

  }
}