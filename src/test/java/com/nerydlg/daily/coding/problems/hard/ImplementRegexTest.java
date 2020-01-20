package com.nerydlg.daily.coding.problems.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementRegexTest {

    @Test
    void validRegex() {
        ImplementRegex subject = new ImplementRegex();
//        assertTrue(subject.isMatch("aa", "a"));
        assertTrue(subject.isMatch("aa", "a*a"));

    }

    @Test
    void invalidRegex() {
        ImplementRegex subject = new ImplementRegex();
        assertFalse(subject.isMatch("aa", "a"));
    }

}