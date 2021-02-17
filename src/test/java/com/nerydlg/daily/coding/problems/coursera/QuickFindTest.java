package com.nerydlg.daily.coding.problems.coursera;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickFindTest {

    private QuickFind subject;

    @Test
    void canFindTwoPointsConnected() {
        // GIVEN
        subject = new QuickFind(5);

        // WHEN
        subject.union(2, 3);
        subject.union(3, 4);
        subject.union(1, 0);

        // THEN
        assertTrue(subject.find(2, 4));
    }

    @Test
    void canFindTwoPointsNotConnected() {
        // GIVEN
        subject = new QuickFind(6);

        // WHEN
        subject.union(2, 3);
        subject.union(1, 0);

        // THEN
        assertFalse(subject.find(2, 4));
    }

    @Test
    void canFindTwoPointsConnectedWithMorePoints() {
        // GIVEN
        subject = new QuickFind(8);

        // WHEN
        subject.union(2, 3);
        subject.union(3, 4);
        subject.union(1, 0);
        subject.union(3, 5);
        subject.union(3, 7);
        subject.union(3, 1);


        // THEN
        assertTrue(subject.find(0, 7));
    }


}