package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxThreeTest {

    private MaxThree subject;

    @Test
    void canFindMaxTreeOne() {
        // GIVEN
        subject = new MaxThree();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {-1, -1, 6, 24, 60};
        // WHEN
        int[] actual = subject.findMaxProduct(input);
        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void canFindMaxTreeTwo() {
        // GIVEN
        subject = new MaxThree();
        int[] input = {2, 4, 7, 1, 5, 3};
        int[] expected = {-1, -1, 56, 56, 140, 140};
        // WHEN
        int[] actual = subject.findMaxProduct(input);
        // THEN
        assertArrayEquals(expected, actual);
    }


    @Test
    void canFindMaxTreeThree() {
        // GIVEN
        subject = new MaxThree();
        int[] input = {2,1,2,1,2};
        int[] expected = {-1,-1,4,4,8};
        // WHEN
        int[] actual = subject.findMaxProduct(input);
        // THEN
        assertArrayEquals(expected, actual);
    }
}