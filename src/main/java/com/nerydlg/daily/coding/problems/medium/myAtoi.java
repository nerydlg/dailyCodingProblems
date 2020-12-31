package com.nerydlg.daily.coding.problems.medium;

public class myAtoi {

    public int myAtoi(String str) {
        if(str == null || str.trim().isEmpty() ) return 0;
        int result = 0;
        str = str.trim();
        int i = 0;
        char ch = str.charAt(i);
        boolean isNegative = (ch == '-' || ch == '+') ? ch == '-' : false;
        int strSize = str.length();
        if(isNegative || ch == '+') {
            i++;
            if(i < strSize) {
                ch = str.charAt(i);
            }
        }
        while(i < strSize &&  (ch >= '0' && ch <= '9')) {

            int val = ch - 48; // char 0 = 48
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && val > 7)) {
                if(!isNegative) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            result = (result * 10)  + val;
            i++;
            if(i < strSize)
                ch = str.charAt(i);
        }
        return isNegative && result > 0 ? result * -1 : result;
    }
}
