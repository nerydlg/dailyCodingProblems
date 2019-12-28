package com.nerydlg.daily.coding.problems;
/**
 * Given an array of integers, return a new array such that each element at index i
 * of the new array is the product of all the numbers in the original array   except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], 
 * the expected output would be [120, 60, 40, 30, 24]. 
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 */

import java.util.Arrays;

public class Solution_2 {
    
    public static void main(String[] args) {
        int[] input_1 = new int[]{1, 2, 3, 4, 5};
        int[] input_2 = new int[]{3, 2, 1};

        Arrays.stream(multiply(input_1)).forEach(System.out::println);
        System.out.println("=====================");
        Arrays.stream(multiply(input_2)).forEach(System.out::println);
    }

    public static int[] multiply(int[] input) {
        if(input == null) return input;
        
        int total = resultAll(input); 
        for(int i = 0; i < input.length; i++) {
            input[i] = total / input[i];
        }

        return input;
    }

    public static int resultAll(int[] input){
        int val = 1;
        for (int i = 0; i < input.length; i++) {
            val *= input[i];
        }
        return val;
    }
}
