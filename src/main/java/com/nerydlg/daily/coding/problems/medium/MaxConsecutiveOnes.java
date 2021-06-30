package com.nerydlg.daily.coding.problems.medium;

public class MaxConsecutiveOnes {

    /**
     * returns the length of the longest consecutive ones
     * doing K changes
     * @param nums array with zeros and ones
     * @param k window size
     * @return maximum consecutive ones
     */
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        while(r < nums.length) {
            if(nums[r] == 0){
                k--;
            }
            if(k < 0) {
                if(nums[l] == 0) k++;
                l++;
            }
            r++;
        }
        return r - l;
    }

}
