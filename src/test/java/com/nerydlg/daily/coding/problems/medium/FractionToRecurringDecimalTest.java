package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionToRecurringDecimalTest {

    private FractionToRecurringDecimal subject = new FractionToRecurringDecimal();

    @Test
    void test_1() {
        // GIVEN
        int numerator = 1;
        int denominator = 2;
        String expected = "0.5";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        // GIVEN
        int numerator = 2;
        int denominator = 1;
        String expected = "2";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        // GIVEN
        int numerator = 2;
        int denominator = 3;
        String expected = "0.(6)";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        // GIVEN
        int numerator = 4;
        int denominator = 333;
        String expected = "0.(012)";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        // GIVEN
        int numerator = -1;
        int denominator = -2147483648;
        String expected = "0.0000000004656612873077392578125";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        // GIVEN
        int numerator = 17;
        int denominator = 6;
        String expected = "2.8(3)";
        // WHEN
        String actual = subject.fractionToDecimal(numerator, denominator);
        // THEN
        assertEquals(expected, actual);
    }
}