package com.nerydlg.daily.coding.problems.medium;

public class FindWaysToGetAWord {

    public int howManyWaysToGetAWord(String numeric) {
        return howManyWaysToGetAWord(numeric, 1);
    }

//    public int howManyWaysToGetAWord(String numeric, int modifier) {
//        int last = 27;
//
//        if(numeric.length() == 1){
//            return numeric.length();
//        } else if(numeric.length() == 2){
//            int num = Integer.valueOf(numeric);
//            if(num == 0) {
//                return 0;
//            } if(num >= last) {
//                return 1 + modifier;
//            } else {
//                return 2 + modifier;
//            }
//        } else {
//            return howManyWaysToGetAWord(numeric.substring(0,2), -1) +
//                    howManyWaysToGetAWord(numeric.substring(1), 0);
//        }
//    }

    public int howManyWaysToGetAWord(String numeric, int previous) {
        int last = 27;
        if(previous == 0) return 0;
        if(numeric.length() == 1){
            if(numeric.equals("0")) {
                return 0;
            } else {
                return previous;
            }
        } else if(numeric.length() == 2){
            int num = Integer.valueOf(numeric);
            if(num == 0 || (numeric.matches("0?[0-9]0?") && num >= last)) {
                return 0;
            } if(num >= last || numeric.matches("0?[0-9]0?")) {
                return previous;
            } else {
                return previous + 1;
            }
        } else {
            int prev = howManyWaysToGetAWord(numeric.substring(0,2), previous);
            return howManyWaysToGetAWord(numeric.substring(1), prev);
        }
    }
}
