package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SquareAreaTest {

  SquareArea subject;

  @Test
  void tests() {
     subject = new SquareArea();
     int actual = 0;
     actual = subject.getLargestPiece("9,9", new int[]{3,6}, new int[]{ 3, 6 }); // 9

     assertEquals(9, actual);
    actual = subject.getLargestPiece("10,10", new int[]{8,2}, new int[]{2,8});
    assertEquals(36, actual);
    actual = subject.getLargestPiece("10,10", new int[]{3}, new int[]{}); // 70
    assertEquals( 70, actual);
    actual = subject.getLargestPiece("10,10", new int[]{}, new int[]{}); // 100
    assertEquals( 100, actual);
    actual = subject.getLargestPiece("100,70", new int[]{25}, new int[]{}); // 5250
    assertEquals( 5250, actual);
    actual = subject.getLargestPiece("100,70", new int[]{}, new int[]{35}); // 3500
    assertEquals( 3500, actual);
    actual = subject.getLargestPiece("100,70", new int[]{50}, new int[]{}); // 3500
    assertEquals( 3500, actual);
    actual = subject.getLargestPiece("100,70", new int[]{80,20}, new int[]{35}); // 2100
    assertEquals(2100, actual);
     actual = subject.getLargestPiece("10,10", new int[]{}, new int[]{8, 9});
     assertEquals(80, actual);
  }


}