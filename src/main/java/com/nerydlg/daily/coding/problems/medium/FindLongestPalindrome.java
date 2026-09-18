package com.nerydlg.daily.coding.problems.medium;

public class FindLongestPalindrome {

  public String longestPalindrome(String s) {
    int size = s.length();
    // we will use a dp table of n*n
    boolean[][] dp = new boolean[size][size];
    // and will keep the result in this ans array
    int[] ans  = new int[] {0, 0};

    // mark all the dp[i][i] as true since they mark the single letters as a palindrome
    // example cabam
    //  c  a  b  a  m
    //c[1, 0, 0, 0, 0]
    //a[0, 1, 0, 0, 0]
    //b[0, 0, 1, 0, 0]
    //a[0, 0, 0, 1, 0]
    //m[0, 0, 0, 0, 1]
    for(int i = 0; i < size; i++) {
      dp[i][i] = true; // for palindromes of size 1
    }

    // now lets mark the palindrome of size 2 only if the next letter is the same
    //  c  a  b  a  m
    //c[1, 0, 0, 0, 0]
    //a[0, 1, 0, 0, 0]
    //b[0, 0, 1, 0, 0]
    //a[0, 0, 0, 1, 0]
    //m[0, 0, 0, 0, 1]
    // in this example it will keep the same
    for(int i = 0; i < size - 1; i++) {
      if(s.charAt(i) == s.charAt(i+1)) {
        dp[i][i + 1] = true; // for palindrome of size 2
        ans[0] = i;
        ans[1] = i + 1;
      }
    }

    // and lastly we need to mark the rest
    //  c  a  b  a  m
    //c[1, 0, 0, 0, 0]
    //a[0, 1, 0, 1, 0]
    //b[0, 1, 1, 1, 0]
    //a[0, 1, 0, 1, 0]
    //m[0, 1, 0, 1, 1]
    for(int diff = 2; diff < size; diff++) {
      for(int i = 0; i < size - diff; i++) {
        int j = i + diff;
        if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
          dp[i][j] = true;
          ans[0] = i;
          ans[1] = j;
        }
      }
    }
    return s.substring(ans[0], ans[1] + 1);
  }
}
