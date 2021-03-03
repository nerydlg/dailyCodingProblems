package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        // prevent division by zero
        if(denominator == 0) return "0";

        StringBuilder result = new StringBuilder();
        // validate if numerator is not zero AND if signs are different
        if(numerator != 0 && (Integer.signum(numerator) != Integer.signum(denominator))) {
            result.append("-");
        }

        // get the integer part
        long dividend = getAbsolute(numerator);
        long divisor = getAbsolute(denominator);
        result.append(String.valueOf(dividend/divisor));
        long remainder = dividend % divisor;
        if(remainder == 0) {
            return result.toString();
        }
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        //get the decimal part
        while(remainder != 0) {
            if(map.containsKey(remainder)) {
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            // save pair position and string length
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(String.valueOf(remainder/divisor));
            remainder %= divisor;
        }
        return result.toString();
    }

    private long getAbsolute(int a) {
        if(a == Integer.MIN_VALUE) {
            return (long) Integer.MIN_VALUE * -1;
        } else {
            return Math.abs(a);
        }
    }
}
