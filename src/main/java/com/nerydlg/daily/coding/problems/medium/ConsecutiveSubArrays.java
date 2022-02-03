package com.nerydlg.daily.coding.problems.medium;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ConsecutiveSubArrays {

    private int[] arr;
    // [3, 4, 1, 6, 2]
    //              ^
    public int[] countSubarrays(int[] arr) {
        Stack<Integer> stack = new Stack<>(); // [1]
        int[] result = new int[arr.length]; // [1,2]
        // do right
        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[i] += result[stack.pop()];
            }
            stack.push(i);
            // for itself
            result[i]++;
        }

        printArray(result);

        stack.clear();
        int[] tmp = new int[arr.length]; // [0,0,0,2,1] s=[4]
        // do left
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int idx = stack.pop();
                result[i] += tmp[idx];
                tmp[i] += tmp[idx];
            }
            stack.push(i);
            tmp[i]++;
        }
        printArray(tmp);
        return result;
    }

    public int[] countSubarrays1(int[] arr) {
        // Write your code here
        this.arr = arr;
        int n = arr.length;
        int[] result = new int[arr.length];
        for(int i = 0; i < n; i++) {
            result[i] = getCountOfSubArraysFrom(i);
        }
        return result;
    }


    private int getCountOfSubArraysFrom(int index) {
        int left = index - 1;
        int right = index + 1;
        int count = 1;
        while(left >= 0 && arr[left] < arr[index]){
            count++;
            left--;
        }
        while(right < arr.length && arr[right] < arr[index]) {
            count++;
            right++;
        }
        return count;
    }

    private void printArray(int[] arr) {
        String str = Arrays.stream(arr).mapToObj(x -> x+"").collect(Collectors.joining(","));
        System.out.println(str);
    }
}
