package com.nerydlg.daily.coding.problems.medium;

public class SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int pivot = 0;
        // binary search
        while(left < right) {
            pivot = (left + right) / 2;
            // if the pivot is even, the duplicate should be at the right
            // if pivot is odd, duplicate should be on the left
            // and we should move left
            if((pivot % 2 == 0 && nums[pivot] == nums[pivot+1] )
                || (pivot % 2 == 1 && nums[pivot] == nums[pivot-1])) {
                left = pivot + 1;
            } else {
                // if not then we move right
                right = pivot;
            }
        }
        // at the end the non duplicate should on the right
        return nums[left];
    }
}
