package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueTest {

    private FirstUnique subject;

    @Test
    void canInitializeWithOne() {
        subject = new FirstUnique(new int[]{1});
        assertEquals(1, subject.showFirstUnique());

    }

    @Test
    void canInitializeWithTwo() {
        subject = new FirstUnique(new int[]{1, 2});

        assertEquals(1, subject.showFirstUnique());
    }

    @Test
    void canInitializeWithMoreDistinct() {
        subject = new FirstUnique(new int[]{1, 2, 3, 4, 5, 6});

        assertEquals(1, subject.showFirstUnique());
    }

    @Test
    void firstest() {
        subject = new FirstUnique(new int[]{2, 3, 5});
        assertEquals(2, subject.showFirstUnique());
        subject.add(5);
        assertEquals(2, subject.showFirstUnique());
        subject.add(2);
        assertEquals(3, subject.showFirstUnique());
        subject.add(3);
        assertEquals(-1, subject.showFirstUnique());

    }

    @Test
    void secondTest() {
        subject = new FirstUnique(new int[]{7, 7, 7, 7, 7, 7});
        assertEquals(-1, subject.showFirstUnique());
        subject.add(7);
        subject.add(3);
        subject.add(3);
        subject.add(7);
        subject.add(17);

        assertEquals(17, subject.showFirstUnique());

    }
}