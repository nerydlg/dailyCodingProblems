package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveKDigitsTest {

  RemoveKDigits subject;

  @Test
  void canFindSmallestNumberFromString() {
    // GIVEN
    String num = "123456";
    int k = 3;
    String expected = "123";
    subject = new RemoveKDigits();
    // WHEN
    String actualEfficient = subject.removeKDigits(num, k);
    String actualMine = subject.removeKdigitsStr(num, k);
    // THEN
    assertEquals(expected, actualEfficient);
    assertEquals(expected, actualMine);
  }

  @Test
  void canFindSmallestNumberFromString_2() {
    // GIVEN
    String num = "1432219";
    int k = 3;
    String expected = "1219";
    subject = new RemoveKDigits();
    // WHEN
    String actualEfficient = subject.removeKDigits(num, k);
    String actualMine = subject.removeKdigitsStr(num, k);
    // THEN
    assertEquals(expected, actualEfficient);
    assertEquals(expected, actualMine);
  }

  @Test
  void canFindSmallestNumberFromString_Zero() {
    // GIVEN
    String num = "000";
    int k = 3;
    String expected = "0";
    subject = new RemoveKDigits();
    // WHEN
    String actualEfficient = subject.removeKDigits(num, k);
    String actualMine = subject.removeKdigitsStr(num, k);
    // THEN
    assertEquals(expected, actualEfficient);
    assertEquals(expected, actualMine);
  }
}