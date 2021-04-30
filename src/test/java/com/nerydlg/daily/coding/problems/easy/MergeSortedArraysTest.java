package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {

    MergeSortedArrays subject = new MergeSortedArrays();

    @Test
    void canMergeSortedArrays_1() {
        // GIVEN
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {5, 7, 8};
        int[] expected = {1, 2, 3, 5, 7, 8};
        // WHEN
        subject.merge(a, 3, b, 3);
        // THEN
        assertArrayEquals(a, expected);
    }

    @Test
    void canMergeSortedArrays_2() {
        // GIVEN
        int[] a = {1, 2, 3};
        int[] b = {};
        int[] expected = {1, 2, 3};
        // WHEN
        subject.merge(a, 3, b, 0);
        // THEN
        assertArrayEquals(a, expected);
    }

    @Test
    void canMergeSortedArrays_3() {
        // GIVEN
        int[] a = {5, 6, 8, 0, 0, 0};
        int[] b = {1, 3, 7};
        int[] expected = {1, 3, 5, 6, 7, 8};
        // WHEN
        subject.merge(a, 3, b, 3);
        // THEN
        assertArrayEquals(a, expected);
    }
}