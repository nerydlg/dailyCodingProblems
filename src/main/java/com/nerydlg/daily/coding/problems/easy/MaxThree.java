package com.nerydlg.daily.coding.problems.easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MaxThree {

    public int[] findMaxProduct(int[] arr) {
        // Write your code here
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            if(i < 2) {
                result[i] = -1;
            } else {
                int x = heap.poll();
                int y = heap.poll();
                int z = heap.poll();
                result[i] = x * y *z;
                heap.add(z);
                heap.add(y);
                heap.add(x);
            }
        }
        return result;
    }
}
