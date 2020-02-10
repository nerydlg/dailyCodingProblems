package com.nerydlg.daily.coding.problems.easy;

public class ClimbStair {

    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int[] prev = new int[n+1];
        for(int i = 0; i < n+1; i++) {
            if(i <= 2){
                prev[i] = i;
            } else {
                prev[i] = prev[i-1] + prev[i -2];
            }
        }
        return prev[n];
    }
}
