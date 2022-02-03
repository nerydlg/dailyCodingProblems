package com.nerydlg.daily.coding.problems.easy;

public class RotationalCipher {
    // Add any helper functions you may need here
    private final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String NUMBERS = "0123456789";

    public String rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(getNextChar(input.charAt(i), rotationFactor));
        }
        return result.toString();
    }

    private char getNextChar(char curr, int offset) {
        //lower case
        int next = 0;
        char result;
        if (curr >= 'a' && curr <= 'z') {
            next = getNextWhenHigher(LOWER.length(), 'a', curr, offset);
            result = LOWER.charAt(next);
        } else if (curr >= 'A' && curr <= 'Z') { // upper case
            next = getNextWhenHigher(UPPER.length(), 'A', curr, offset);
            result = UPPER.charAt(next);
        } else if (curr >= '0' && curr <= '9') { // is number
            next = getNextWhenHigher(NUMBERS.length(), '0', curr, offset);
            result = NUMBERS.charAt(next);
        } else {
            result = curr;
        }
        return result;
    }

    /**
     *
     *
     * @param limit
     * @param start
     * @param curr
     * @param offset
     * @return
     */
    private int getNextWhenHigher(int limit, char start, char curr, int offset) {
        int id = curr - start;
        int next = id + offset;
        next = next % limit;
        return next;
    }
}
