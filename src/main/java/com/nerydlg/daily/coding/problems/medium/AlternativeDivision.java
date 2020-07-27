package com.nerydlg.daily.coding.problems.medium;

public class AlternativeDivision {

    /*
    Implement division of two positive integers without using the division,
    multiplication, or modulus operators. Return the quotient as an integer,
    ignoring the remainder.
     */

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int result = 0;
        boolean isPositive = (dividend >= 0 && divisor >= 0) || (dividend < 0 && divisor < 0);
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        if(absDivisor == 1 || absDivisor == -1) {
            return !isPositive ? absDividend * -1 : absDividend;
        }
        while(absDividend - absDivisor >= 0) {
            absDividend -= absDivisor;
            result--;
        }
        return isPositive ? result * -1 : result;
    }
}
