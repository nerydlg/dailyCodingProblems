package com.nerydlg.daily.coding.problems;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
class Solution_5 {
    public static void main(String[] args){
        System.out.println(rob(new int[]{1,3,1,3,100}));
    }


    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int temp = 0;
        int max = nums[0];
        int prev = 0;

        for(int i = 1; i < nums.length; i++) {
            temp  = max;
            max = Math.max(prev+nums[i], max);
            prev = temp;
        }

        return max;
    }



}
