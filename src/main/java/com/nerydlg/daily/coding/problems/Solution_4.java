package com.nerydlg.daily.coding.problems;


public class Solution_4 {

    public static int firstMissingPositive(int[] nums) {
        return findFirstMissingPositiveOrdered(sort(sort(nums)));
    }

    private static int findFirstMissingPositiveOrdered(int[] sorted) {
        int minPositive = 1;
        if(sorted == null) return minPositive;
        for(int i=0; i < sorted.length; i++) {
            if(sorted[i] == minPositive) {
                minPositive++;
            }
        }
        return minPositive;
    }

    private static int[] sort(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        int aux = 0;
        int steps = nums.length / 10 + 1;
        for(int j = 0; j < steps; j++) {
            for (int i = 0; i < nums.length; i++) {
                int curr = nums[i];
                if (curr <= i && curr > 0) {
                    // swap
                    aux = nums[curr - 1];
                    nums[curr - 1] = nums[i];
                    nums[i] = aux;
                }
            }
        }
        return nums;
    }


}