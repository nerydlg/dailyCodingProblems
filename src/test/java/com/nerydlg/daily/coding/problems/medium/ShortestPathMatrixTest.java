package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathMatrixTest {

    private ShortestPathMatrix subject = new ShortestPathMatrix();

    @Test
    void canReachPoint() {
        // GIVEN
        int[][] matrix = {
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 1},
                {1, 0, 0, 1, 0},
                {1, 1, 1, 1, 1}
        };
        int[] src = {0, 0};
        int[] dest = {4, 1};
        int expected = 5;
        // WHEN
        int actual = subject.stepsToReachThePoint(matrix, src, dest);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void canReachPoint1() {
        // GIVEN
        int[][] matrix = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
        };
        int[] src = {0, 0};
        int[] dest = {4, 1};
        int expected = 11;
        // WHEN
        int actual = subject.stepsToReachThePoint(matrix, src, dest);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void canReachPoint3() {
        // GIVEN
        int[][] matrix = {
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
        };
        int[] src = {0, 0};
        int[] dest = {4, 1};
        int expected = -1;
        // WHEN
        int actual = subject.stepsToReachThePoint(matrix, src, dest);
        // THEN
        assertEquals(expected, actual);
    }

}