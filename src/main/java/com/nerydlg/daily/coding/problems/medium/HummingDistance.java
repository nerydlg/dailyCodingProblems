package com.nerydlg.daily.coding.problems.medium;

public class HummingDistance {

    private int hummingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    // x = [1, 2, 3]
    // then I have to get the humming distance between 1 and 2, 1 and 3, and 2 and3
    // humming distance between 1 and 2 is 1, 1 and 3 is 2, 2 and 3 is 1
    // and then sum 4
    // x = [1, 2, 3, 4]
    // then I have to get the humming distance between 1 and 2, 1 and 3, 1 and 4, 2 and 3, 2 and 4, 3 and 4
    // and then sum
    public int GetSumOfDistances(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                sum += hummingDistance(x[i], x[j]);
            }
        }
        return sum;
    }

}
