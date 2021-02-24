package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingRangesTest {

    private MissingRanges subject;

    @BeforeEach
    void setUp() {
        subject = new MissingRanges();
    }

    @Test
    void findRangeTest_1() {
        // GIVEN
        int[] nums = {1, 2, 5, 34, 35, 36, 50, 80};
        int lower = 0;
        int upper = 100;
        List<String> expected = List.of("0", "3->4", "6->33", "37->49", "51->79", "81->100");
        // WHEN
        List<String> actual = subject.findMissingRanges(nums, lower, upper);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void findRangeTest_2() {
        // GIVEN
        int[] nums = {9};
        int lower = 0;
        int upper = 9;
        List<String> expected = List.of("0->8");
        // WHEN
        List<String> actual = subject.findMissingRanges(nums, lower, upper);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void findRangeTest_3() {
        // GIVEN
        int[] nums = {};
        int lower = 1;
        int upper = 1;
        List<String> expected = List.of("1");
        // WHEN
        List<String> actual = subject.findMissingRanges(nums, lower, upper);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void findRangeTest_4() {
        // GIVEN
        int[] nums = {};
        int lower = -3;
        int upper = -1;
        List<String> expected = List.of("-3->-1");
        // WHEN
        List<String> actual = subject.findMissingRanges(nums, lower, upper);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void findRangeTest_5() {
        // GIVEN
        int[] nums = {-1};
        int lower = -1;
        int upper = -1;
        List<String> expected = List.of();
        // WHEN
        List<String> actual = subject.findMissingRanges(nums, lower, upper);
        // THEN
        assertEquals(actual, expected);
    }
}