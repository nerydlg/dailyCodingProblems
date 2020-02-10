package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbStairTest {

    private ClimbStair subject = new ClimbStair();

    @Test
    void climb1StepStair() {
        assertEquals(1, subject.climbStairs(1));
    }

    @Test
    void climb2StepStair() {
        assertEquals(2, subject.climbStairs(2));
    }

    @Test
    void climb3StepStair() {
        assertEquals(3, subject.climbStairs(3));
    }

    @Test
    void climb4StepStair() {
        assertEquals(5, subject.climbStairs(4));
    }

    @Test
    void climb5StepStair() {
        assertEquals(8, subject.climbStairs(5));
    }
}