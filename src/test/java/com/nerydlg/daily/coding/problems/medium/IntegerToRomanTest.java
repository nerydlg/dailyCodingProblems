package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {


  @Test
  public void test_3543() {
    // GIVEN
    int num = 3543;
    String expect = "MMMDXLIII";
    IntegerToRoman integerToRoman = new IntegerToRoman();
    // WHEN
    String actual = integerToRoman.intToRoman(num);
    // THEN
    assertEquals(expect, actual);
  }

  @Test
  public void test_8() {
    // GIVEN
    int num = 8;
    String expect = "VIII";
    IntegerToRoman integerToRoman = new IntegerToRoman();
    // WHEN
    String actual = integerToRoman.intToRoman(num);
    // THEN
    assertEquals(expect, actual);
  }

  @Test
  public void test_9() {
    // GIVEN
    int num = 9;
    String expect = "IX";
    IntegerToRoman integerToRoman = new IntegerToRoman();
    // WHEN
    String actual = integerToRoman.intToRoman(num);
    // THEN
    assertEquals(expect, actual);
  }

  @Test
  public void test_16() {
    // GIVEN
    int num = 16;
    String expect = "XVI";
    IntegerToRoman integerToRoman = new IntegerToRoman();
    // WHEN
    String actual = integerToRoman.intToRoman(num);
    // THEN
    assertEquals(expect, actual);
  }
}