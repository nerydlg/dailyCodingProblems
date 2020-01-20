package com.nerydlg.daily.coding.problems.easy;

/**
 * Fibonacci but with 3 last numbers
 */
public class Fibonacci3 {

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int fibonacciWith3(int n) {
        if(n <= 2) {
            return n;
        } else {
            return fibonacciWith3(n-1) + fibonacciWith3(n-2) + fibonacciWith3(n-3);
        }
    }
}
