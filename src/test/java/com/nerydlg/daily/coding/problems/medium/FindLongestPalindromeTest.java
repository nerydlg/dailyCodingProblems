package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.easy.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLongestPalindromeTest {

  @Test
  public void CanFindLongestPalindrome() {
    // GIVEN
    FindLongestPalindrome lp = new FindLongestPalindrome();
    String test = "babad";
    String expected = "aba";
    // WHEN
    String result = lp.longestPalindrome(test);
    // THEN
    Assertions.assertEquals(expected, result);
  }

}