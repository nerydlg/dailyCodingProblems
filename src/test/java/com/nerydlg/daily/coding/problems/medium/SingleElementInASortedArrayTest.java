package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleElementInASortedArrayTest {

    SingleElementInASortedArray subject = new SingleElementInASortedArray();

    @Test
    void findDuplicateTestOne() {
        // GIVEN
        int[] input = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8};
        int expected = 6;
        // WHEN
        int actual = subject.singleNonDuplicate(input);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void findDuplicateTestTwo() {
        // GIVEN
        int[] input = {3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int expected = 4;
        // WHEN
        int actual = subject.singleNonDuplicate(input);
        // THEN
        assertEquals(expected, actual);
    }
}