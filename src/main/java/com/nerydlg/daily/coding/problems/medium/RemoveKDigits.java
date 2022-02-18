package com.nerydlg.daily.coding.problems.medium;

import java.util.LinkedList;

public class RemoveKDigits {

  /**
   * more efficient solution comes by using a LinkedList
   * and removing the number if they are bigger than the previous one
   * @param num
   * @param k
   */
  public String removeKDigits(String num, int k) {
    LinkedList<Character> stack = new LinkedList<>();
    int n = num.length();
    for(int i = 0; i < n; i++) {
      char ch = num.charAt(i);
      while(!stack.isEmpty() && k > 0 && stack.peekLast() > ch) {
        stack.removeLast();
        k--;
      }
      stack.addLast(ch);
    }

    // make sure that we remove k elements
    for(int i = 0; i < k; i++) {
      stack.removeLast();
    }

    // build the string
    StringBuilder result = new StringBuilder();
    boolean leadingZero = true;
    for(char ch : stack) {
      if(leadingZero && ch == '0') {
        continue;
      }
      leadingZero = false;
      result.append(ch);
    }
    if(result.length() == 0) {
      return "0";
    }
    return result.toString();
  }


  // My initial approach was backtrack be backtrack
  public String removeKdigitsStr(String num, int k) {
    StringBuilder remain = new StringBuilder(num);
    String number = backtrackStr(0, k, remain, "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    return (number.length() == 0 || number.matches("0*")) ? "0" : removeTrailingZeros(number);
  }

  private String removeTrailingZeros(String number) {
    return number.replaceAll("^0*", "");
  }

  /**
   * This was my second approach previous one failed with big inputs
   * @param start
   * @param remove
   * @param remain
   * @param min
   * @return
   */
  private String backtrackStr(int start, int remove, StringBuilder remain, String min) {
    // if there is no more elements to go return zero
    if(remain.length() == 0) {
      return remain.toString();
    }
    // we reach the new number
    if(remove == 0) {
      return min(remain.toString(), min);
    }
    int length = remain.length();
    for(int i = start; i < length; i++) {
      char ch = remain.charAt(i);
      remain.deleteCharAt(i);
      String newMin = backtrackStr(i, remove - 1, remain, min);
      remain.insert(i, ch);
      min = min(newMin, min);
    }
    return min;
  }

  /**
   * This was my first approach which failed with big number because the int overflows
   * @param start
   * @param remove
   * @param remain
   * @param min
   * @return
   */
  private int backtrackInt(int start, int remove, StringBuilder remain, int min) {
    // if there is no more elements to go return zero
    if(remain.length() == 0) {
      return 0;
    }
    // we reach the new number
    if(remove == 0) {
      int newMin = Integer.valueOf(remain.toString());
      return Math.min(newMin, min);
    }
    int length = remain.length();
    for(int i = start; i < length; i++) {
      char ch = remain.charAt(i);
      remain.deleteCharAt(i);
      int newMin = backtrackInt(i, remove - 1, remain, min);
      remain.insert(i, ch);
      min = Math.min(newMin, min);
    }
    return min;
  }

  private String min(String a, String b) {
    if(a.compareTo(b) < 0) {
      return a;
    }
    return b;
  }
}
