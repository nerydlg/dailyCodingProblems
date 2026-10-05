package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Sum3ToZeroTest {

  @Test
  void canFind3NumbersThatSumZero() {
    // GIVEN
    Sum3ToZero sut = new Sum3ToZero();
    List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
    // WHEN
    List<List<Integer>> result = sut.threeSum(new int[]{-4, -1, -1, 0, 1, 2,});
    // THEN
    assertIterableEquals(expected, result);
  }

  @Test
  void canFind3zerosThatSumZero() {
    // GIVEN
    Sum3ToZero sut = new Sum3ToZero();
    List<List<Integer>> expected = List.of(List.of(0,0,0));
    // WHEN
    List<List<Integer>> result = sut.threeSum(new int[]{0,0,0,0});
    // THEN
    assertIterableEquals(expected, result);
  }

}