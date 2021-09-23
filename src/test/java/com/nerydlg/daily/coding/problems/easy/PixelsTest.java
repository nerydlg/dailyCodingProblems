package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PixelsTest {

    Pixels subject = new Pixels();

    @Test
    void test1() {
        // GIVEN
        int[][] input = {
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 0, 0, 0}
        };
        List<Integer> expected = List.of(4, 1, 2, 1);
        // WHEN
        List<Integer> result = subject.getPicturesFromPixels(input);
        // THEN
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        // GIVEN
        int[][] input = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        List<Integer> expected = List.of(16);
        // WHEN
        List<Integer> result = subject.getPicturesFromPixels(input);
        // THEN
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        // GIVEN
        int[][] input = {
                {0, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 0}
        };
        List<Integer> expected = List.of(3,1,2,3,1);
        // WHEN
        List<Integer> result = subject.getPicturesFromPixels(input);
        // THEN
        assertEquals(expected, result);
    }


}