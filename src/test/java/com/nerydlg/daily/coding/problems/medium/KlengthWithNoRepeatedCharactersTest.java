package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KlengthWithNoRepeatedCharactersTest {

    private KlengthWithNoRepeatedCharacters subject = new KlengthWithNoRepeatedCharacters();

    @Test
    void shouldReturnSiz_WhenStringIs_havefunonleetcode() {
        String str = "havefunonleetcode";
        int k = 5;

        int result = subject.numKLenSubstrNoRepeats(str, k);
        assertEquals(result, 6);
    }

    @Test
    void shouldReturnZero_WhenStringIsLowerThanK() {
        String str = "home";
        int k = 5;

        int result = subject.numKLenSubstrNoRepeats(str, k);
        assertEquals(result, 0);
    }

    @Test
    void shouldReturnThree_WhenStringIs_abab() {
        String str = "abab";
        int k = 2;

        int result = subject.numKLenSubstrNoRepeats(str, k);
        assertEquals(result, 3);
    }

}