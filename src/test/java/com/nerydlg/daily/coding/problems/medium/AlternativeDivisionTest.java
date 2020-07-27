package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternativeDivisionTest {

    private AlternativeDivision subject;

    @Test
    void canDivideTest() {
        subject = new AlternativeDivision();
        assertEquals(subject.divide(10, 3), 10 / 3);
        assertEquals(subject.divide(0, 3), 0 / 3);
        assertEquals(subject.divide(-9, 3), -9 / 3);
        assertEquals(subject.divide(100000, 10), 100000 / 10);
        assertEquals(subject.divide(23424243, 23434), 23424243 / 23434);
        assertEquals(subject.divide(768956749, 1), 768956749 / 1);
        assertEquals(subject.divide(Integer.MIN_VALUE, 1), Integer.MIN_VALUE / 1);
        assertEquals(subject.divide(Integer.MAX_VALUE, -1), Integer.MAX_VALUE / -1);
        assertEquals(subject.divide(Integer.MIN_VALUE, 2), Integer.MIN_VALUE / 2);
    }

}