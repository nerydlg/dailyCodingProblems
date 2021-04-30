package com.nerydlg.daily.coding.problems.easy;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j =0;
        int c = 0;
        // create a new array with the same size
        int[] nums = new int[m+n];

        // iterate over both arrays
        while(c < m+n) {
            // if i is higher than m then there is no more elements in nums1
            if(i >= m) {
                nums[c] = nums2[j++];
                // if j is higher than n then there is no more elements in nums2
            } else if(j >= n) {
                nums[c] = nums1[i++];
                // if nums1 has a lower value than nums2 then use nums1
            }else if(nums1[i] < nums2 [j]) {
                nums[c] = nums1[i++];
            }else {
                // if nums2 has a lower value than nums1 then use nums2
                nums[c] = nums2[j++];
            }
            c++;
        }
        // pass the values to the nums1
        for(c=0; c < nums.length; c++) {
            nums1[c] = nums[c];
        }
    }
}
