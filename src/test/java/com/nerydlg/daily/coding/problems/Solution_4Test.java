package com.nerydlg.daily.coding.problems;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_4Test {

    private Solution_4 subject;

    @Test
    void firstMissingPositive_base() {
        int[] input = new int[]{99,94,96,11,92,5,91,89,57,85,66,63,84,81,79,61,74,78,77,30,64,13,58,18,70,69,51,
                12,32,34,9,43,39,8,1,38,49,27,21,45,47,44,53,52,48,19,50,59,3,40,31,82,23,56,37,41,16,28,22,33,65,
                42,54,20,29,25,10,26,4,60,67,83,62,71,24,35,72,55,75,0,2,46,15,80,6,36,14,73,76,86,88,7,17,87,68,
                90,95,93,97,98};
        Assertions.assertEquals(100,  subject.firstMissingPositive(input));
    }

    @Test
    void firstMissingPositive_second() {
        int[] input = new int[]{2,1,0};
        Assertions.assertEquals(3,  subject.firstMissingPositive(input));
    }

    @Test
    void firstMissingPositive_third() {
        int[] input = new int[]{3,4,-1,1};
        Assertions.assertEquals(2,  subject.firstMissingPositive(input));
    }

    @Test
    void firstMissingPositive_fourth() {
        int[] input = new int[]{7,8,9,11,12};
        Assertions.assertEquals(1,  subject.firstMissingPositive(input));
    }

}