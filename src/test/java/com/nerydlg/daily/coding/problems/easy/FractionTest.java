package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void add() {

        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction result = a.add(b);
        assertEquals(6, result.getDenominator());
        assertEquals(5, result.getNumerator());
    }
}