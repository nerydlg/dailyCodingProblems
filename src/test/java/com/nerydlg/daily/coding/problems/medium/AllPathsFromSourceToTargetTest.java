package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPathsFromSourceToTargetTest {

    AllPathsFromSourceToTarget subject = new AllPathsFromSourceToTarget();

    @Test
    void fromZerotoTree() {
        int[][] input = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = List.of(List.of(0,1,3), List.of(0,2,3));
        assertIterableEquals(expected, subject.allPathsSourceTarget(input));
    }

    @Test
    void fromZeroToFour() {
        int[][] input = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> expected = List.of(List.of(0,4), List.of(0, 3, 4), List.of(0, 1, 3, 4), List.of(0,1,2,3,4), List.of(0,1,4));
        assertIterableEquals(expected, subject.allPathsSourceTarget(input));
    }

    @Test
    void fromZeroToOne() {
        int[][] input = new int[][]{{1}, {}};
        List<List<Integer>> expected = List.of(List.of(0,1));
        assertIterableEquals(expected, subject.allPathsSourceTarget(input));
    }

    @Test
    void fromZeroToFour_2() {
        int[][] input = new int[][]{{1, 3}, {2}, {3}, {}};
        List<List<Integer>> expected = List.of(List.of(0,1,2,3), List.of(0, 3));
        assertIterableEquals(expected, subject.allPathsSourceTarget(input));
    }
}