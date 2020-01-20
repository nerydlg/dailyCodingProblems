package com.nerydlg.daily.coding.problems.easy;


public class Fraction {

    private final int numerator;
    private final int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int mcd = mcd(denominator, other.getDenominator());
        int num = (mcd/denominator) * other.getNumerator() + (mcd/other.getDenominator()) * this.numerator;
        return new Fraction(num, mcd);
    }

    private int mcd(int a, int b) {
        return a*b / gcf(a, b, 1);
    }

    private int gcf(int a, int b, int gcf) {
        if( (a % gcf) == 0 && (b % gcf) == 0) {
            return gcf(a, b, gcf+1);
        } else {
            return gcf-1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}
