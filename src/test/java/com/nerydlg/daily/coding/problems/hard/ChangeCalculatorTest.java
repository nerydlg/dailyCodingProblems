package com.nerydlg.daily.coding.problems.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


class ChangeCalculatorTest {

    @Test
    void canGiveChange() {
        ChangeCalculator subject = new ChangeCalculator();
        ChangeCalculator.Change result = subject.giveChangeFrom(11L);
        assertNotNull(result);
        assertEquals(0, result.billOf10);
        assertEquals(1, result.billOf5);
        assertEquals(3, result.coinOf2);
    }

    @Test
    void canGiveChange2() {
        ChangeCalculator subject = new ChangeCalculator();
        ChangeCalculator.Change result = subject.giveChangeFrom(111L);
        assertNotNull(result);
        assertEquals(10, result.billOf10);
        assertEquals(1, result.billOf5);
        assertEquals(3, result.coinOf2);
    }

    @Test
    void canGiveChange3() {
        ChangeCalculator subject = new ChangeCalculator();
        int[] coins = new int[]{5,2,1};
        int result = subject.giveChange(11, coins, 0, 0);
        assertEquals(3, result);
    }

    @Test
    void cantGiveChange() {
        ChangeCalculator subject = new ChangeCalculator();
        ChangeCalculator.Change result = subject.giveChangeFrom(0L);
        assertNull(result);
    }
}