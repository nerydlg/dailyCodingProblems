package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {

    ExcelSheetColumnNumber subject = new ExcelSheetColumnNumber();

    @Test
    void canConvertOneLetter() {
        // GIVEN
        String input = "A";
        int expected = 1;
        // WHEN
        int actual = subject.titleToNumber(input);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void canConvertTwoLetters() {
        // GIVEN
        String input = "AB";
        int expected = 28;
        // WHEN
        int actual = subject.titleToNumber(input);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void canConvertZYLetter() {
        // GIVEN
        String input = "ZY";
        int expected = 701;
        // WHEN
        int actual = subject.titleToNumber(input);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void canConvertSevenLetter() {
        // GIVEN
        String input = "FXSHRXW";
        int expected = 2147483647;
        // WHEN
        int actual = subject.titleToNumber(input);
        //THEN
        assertEquals(expected, actual);
    }
}