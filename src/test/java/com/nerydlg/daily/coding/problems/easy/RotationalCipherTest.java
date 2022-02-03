package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotationalCipherTest {

    RotationalCipher subject;

    @Test
    void canCypherABCThreeChars() {
        // GIVEN
        String input = "abc";
        int rotate = 3;
        String expected = "def";
        subject = new RotationalCipher();
        // WHEN
        String actual = subject.rotationalCipher(input, rotate);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void canCypherZebra() {
        // GIVEN
        String input = "Zebra-493?";
        int rotate = 3;
        String expected = "Cheud-726?";
        subject = new RotationalCipher();
        // WHEN
        String actual = subject.rotationalCipher(input, rotate);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void canCypherTree() {
        // GIVEN
        String input = "abcdefghijklmNOPQRSTUVWXYZ0123456789";
        int rotate = 39;
        String expected = "nopqrstuvwxyzABCDEFGHIJKLM9012345678";
        subject = new RotationalCipher();
        // WHEN
        String actual = subject.rotationalCipher(input, rotate);
        // THEN
        assertEquals(expected, actual);
    }
}