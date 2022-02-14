package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntervalIntersectionTest {

  IntervalIntersection subject;

  @Test
  void canFindInterjectionBetweenTwoLists() {
    // GIVEN
    subject = new IntervalIntersection();
    int[][] arrA = {{0,2}, {5,10}, {13,23}, {24, 25}};
    int[][] arrB = {{1,5}, {8,12}, {15,24}, {25, 26}};

    int[][] expected = {{1, 2},{5, 5},{8, 10},{15, 23},{24, 24},{25, 25}};
    // WHEN
    int[][] actual = subject.intervalIntersection(arrA, arrB);
    // THEN
    assertArrayEquals(expected, actual);
  }
}