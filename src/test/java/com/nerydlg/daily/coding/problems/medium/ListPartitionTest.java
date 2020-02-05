package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListPartitionTest {

    private ListPartition subject = new ListPartition();

    @Test
    void canFindPartition() {
        List<Integer> input = Arrays.asList(9, 12, 3, 5, 14, 10, 10);
        List<Integer> actual = subject.partitionList(input, 10);

        actual.stream().forEach(System.out::println);
        assertEquals(input.size(), actual.size());

    }

    @Test
    void canFindPartitionFromNull() {
        List<Integer> input = null;
        List<Integer> actual = subject.partitionList(input, 10);

        actual.stream().forEach(System.out::println);
        assertEquals(0, actual.size());
    }
}