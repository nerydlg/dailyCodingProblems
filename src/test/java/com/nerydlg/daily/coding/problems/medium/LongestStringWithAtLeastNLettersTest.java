package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringWithAtLeastNLettersTest {

  LongestStringWithAtLeastNLetters subject;
  @Test
  void canGenerateDiverseString() {
    // GIVEN
    int a = 7, b = 1, c = 1;
    String expected = "ccaccbcc";
    subject = new LongestStringWithAtLeastNLetters();
    // WHEN
    String actual = subject.longestDiverseString(a, b, c);
    // THEN
    assertEquals(actual, expected);
  }
}