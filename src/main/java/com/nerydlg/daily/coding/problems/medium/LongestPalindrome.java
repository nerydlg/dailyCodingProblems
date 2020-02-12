package com.nerydlg.daily.coding.problems.medium;

import java.util.Stack;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if(s == null) return "";
        int start = 0;
        int end = 0;
        int length = s.length();
        String longestPalindrome = "";
        while(start < length) {
            String test = s.substring(start, end);
            if(isPalidrome(test)) {
                if(longestPalindrome.length() < test.length()) {
                    longestPalindrome = test;
                }
            }
            if(end < length) {
                end++;
            } else {
                start++;
                end = start;
            }
        }
        return longestPalindrome;
    }


    public boolean isPalidrome(String s) {
        Stack<Character> stack = new Stack<>();
        int slow = 0;
        int fast = 0;
        int length = s.length();
        if(length == 1) return true;
        while(fast < length){
            Character ch = s.charAt(slow);
            stack.push(ch);

            slow++;
            fast += 2;
        }
        if(fast > length){
            slow--;
        }
        while(slow < length) {
            if(!stack.peek().equals(s.charAt(slow))) {
                break;
            } else {
                stack.pop();
            }
            slow++;
        }
        return stack.empty();
    }
}
