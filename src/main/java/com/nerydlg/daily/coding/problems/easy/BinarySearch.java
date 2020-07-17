package com.nerydlg.daily.coding.problems.easy;

public class BinarySearch {

    public int indexOf(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int pivot = 0;
        while(left <= right) {
            pivot = left + (right - left) / 2;
            if(arr[pivot] == k) {
                return pivot;
            } else if(arr[pivot] > k){
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }

    public boolean exists(int[] arr, int k){
        return indexOf(arr, k) >= 0;
    }

}
