package com.nerydlg.daily.coding.problems.hard;

import java.util.Arrays;

public class ProductOfArrayExcept{
    public static void main(String[] args) {
        ProductOfArrayExcept paes = new ProductOfArrayExcept();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        int[] input=new int[]{2,3,5,0};
        paes.product(input);
    }

    private int[] product(int[] input) { // { 1, 2, 3, 4 }
        if (input == null || input.length == 0) return new int[0];
        int[] result = new int[input.length]; //{ 1, 1, 2, 6}
        result[0] = (input[0] == 0) ? 0 : 1; // 1
        result[1] = input[0]; // 1

        for (int i = 2; i < input.length; i++) { // { 12, 24, 8, 6}  length = 3
            result[i] = result[i - 1] * input[i - 1];
        }
        Arrays.stream(result).forEach(op -> System.out.println(op));

        int beforeLast = input[input.length - 1]; // beforeLast = 4
        result[input.length - 2] = result[input.length - 2] * beforeLast;
        int j = input.length - 3;
        while (j >= 0) {
            beforeLast = beforeLast * input[j + 1];
            result[j] = beforeLast * result[j];
            j--;
        }
        Arrays.stream(result).forEach(op -> System.out.println(op));
        return result;
    }
}