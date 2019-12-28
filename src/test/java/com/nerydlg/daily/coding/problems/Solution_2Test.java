package com.nerydlg.daily.coding.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_2Test {

    @Test
    void multiplyTest1() {
        int[] input_1 = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{120, 60, 40, 30, 24};
        assertArrayEquals(expected, Solution_2.multiply(input_1));
    }

    @Test
    void multiplyTest2() {
        int[] input_2 = new int[]{3, 2, 1};
        int[] expected = new int[]{2, 3, 6};
        assertArrayEquals(expected, Solution_2.multiply(input_2));
    }
}