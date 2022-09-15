package com.nerydlg.daily.coding.problems.medium;

public class LongestStringWithAtLeastNLetters {
  public String longestDiverseString(int a, int b, int c) {
    StringBuilder sb = new StringBuilder();
    generateLongestDiverseString(a, b, c, "a", "b", "c", sb);
    return sb.toString();
  }

  private void generateLongestDiverseString(int a, int b, int c, String aa, String bb, String cc, StringBuilder sb) {
    if(a < b) {
      generateLongestDiverseString(b, a, c, bb, aa, cc, sb);
      return;
    }
    if(b < c) {
      generateLongestDiverseString(a, c, b, aa, cc, bb, sb);
      return;
    }
    // case base
    if(b == 0) {
      sb.append(repeat(aa, Math.min(2, a)));
    }
    // calculate how many elements we are going to take from each character
    int aUse = Math.min(2, a), bUse = a - aUse >= b ? 1 : 0;
    //
    sb.append(repeat(aa, aUse))
          .append(repeat(bb, bUse));
    generateLongestDiverseString(a - aUse, b - bUse, c, aa, bb, cc, sb);
  }

  private String repeat(String s, int times) {
    return s;
  }

}
