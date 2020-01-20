package com.nerydlg.daily.coding.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci3Test {

    @Test
    void fibonacciTest_of_2() {
        int result = Fibonacci3.fibonacci(4);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void fibonacci_of_3() {
        int result = Fibonacci3.fibonacciWith3(1);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void fibonacci_of_3B() {
        int result = Fibonacci3.fibonacciWith3(2);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void fibonacci_of_3C() {
        int result = Fibonacci3.fibonacciWith3(3);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void fibonacci_of_3D() {
        int result = Fibonacci3.fibonacciWith3(4);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    void fibonacci_of_3E() {
        int result = Fibonacci3.fibonacciWith3(5);
        int expected = 11;
        assertEquals(expected, result);
    }
}