package com.nerydlg.daily.coding.problems.hard;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReachingPointsTest {

    ReachingPoints subject = new ReachingPoints();

    @Test
    void canReachThePointsA() {
        // GIVEN
        int sx = 1, sy = 1, tx=3, ty=5;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertTrue(actual);
    }

    @Test
    void cantReachThePointsB() {
        // GIVEN
        int sx = 2, sy = 2, tx=3, ty=5;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertFalse(actual);
    }

    @Test
    void canReachSamePoint() {
        // GIVEN
        int sx = 2, sy = 2, tx=2, ty=2;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertTrue(actual);
    }

    @Test
    void canReachThePointsC() {
        // GIVEN
        int sx = 3, sy = 3, tx=9, ty=12;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertTrue(actual);
    }

    @Test
    void cantReachThePointsD() {
        // GIVEN
        int sx = 270, sy = 20, tx=300, ty=500;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertFalse(actual);
    }

    @Test
    void cantReachAFarPoint() {
        // GIVEN
        int sx = 35, sy = 13, tx=455955547, ty=420098884;
        // WHEN
        boolean actual = subject.reachingPoints(sx, sy, tx, ty);
        // THEN
        assertFalse(actual);
    }

}