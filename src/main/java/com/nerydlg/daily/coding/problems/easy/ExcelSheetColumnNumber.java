package com.nerydlg.daily.coding.problems.easy;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int result = 0;
        int pos = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            int c = (s.charAt(i) - 'A') + 1;
            result += c * Math.pow(26, pos++);
        }
        return result;
    }
}
