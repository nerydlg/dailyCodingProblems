package com.nerydlg.daily.coding.problems.easy;

import com.nerydlg.daily.coding.problems.Solution_3;

public class MoveZeros {


    public void moveZeroesPrev(int[] nums) { // {1, 3, 12, 0, 0}
        if(nums == null || nums.length <= 1) return;
        //int zerosCount = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) { // i = 2
            if(nums[i] == 0) {
               // zerosCount++; // zerosCount = 3
                j = i+1; // j = 5;
                while(j < nums.length && nums[j] == 0){
                    j++;
                }
                if( j < nums.length) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }


    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int zerosCount = 0;
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zerosCount++;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }

        for(int j = 1; j <= zerosCount; j++) {
            nums[nums.length - j] = 0;
        }

    }

}
