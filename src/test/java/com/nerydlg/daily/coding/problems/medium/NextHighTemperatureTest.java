package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class NextHighTemperatureTest {

    private NextHighTemperature subject;

    @Test
    void canFoundTempDifference() {
        // GIVEN
        int[] temperatures = new int[]{31, 32, 33, 34, 33, 35};
        subject = new NextHighTemperature();
        int[] expected = new int[]{1,1,1,2,1,0};
        // WHEN
        int[] actual = subject.dailyTemperatures(temperatures);
        // THEN
        assertArrayEquals(expected, actual);
    }
}