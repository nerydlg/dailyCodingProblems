package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWaysToGetAWordTest {

    FindWaysToGetAWord subject = new FindWaysToGetAWord();

    @Test
    void howManyWaysToFindAWordWhenInputIsOneDigit(){
        String input = "8";
        assertEquals(1, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindAWordWhenInputIsTwoDigits(){
        String input = "24";
        assertEquals(2, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindAWordWhenInputIsTwoDigitsAreHigerThan_27(){
        String input = "28";
        assertEquals(1, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindAWordWhenInputIsThreeDigits(){
        String input = "248";
        assertEquals(2, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindAWordWhenInputIsThreeDigits_2(){
        String input = "123";
        assertEquals(3, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindAWordWhenSizeIsHigherThanThree(){
        String input = "123667";
        assertEquals(3, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindWordWhenInputIsZero() {
        String input = "0";
        assertEquals(0, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindWordWhenInputIs_10() {
        String input = "10";
        assertEquals(1, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void howManyWaysToFindWordWhenInputIs_1000() {
        String input = "1000";
        assertEquals(0, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void whenIsNotPossibleDecode() {
        String input = "708";
        assertEquals(0, subject.howManyWaysToGetAWord(input));
    }

    @Test
    void whenIsNotPossibleDecode_2() {
        String input = "101";
        assertEquals(1, subject.howManyWaysToGetAWord(input));
    }
}