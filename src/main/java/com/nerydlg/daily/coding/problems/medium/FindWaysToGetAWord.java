package com.nerydlg.daily.coding.problems.medium;

public class FindWaysToGetAWord {

    public int howManyWaysToGetAWord(String numeric) {
        return howManyWaysToGetAWord(numeric, 0);
    }

    public int howManyWaysToGetAWord(String numeric, int modifier) {
        int last = 27;
        int num = Integer.valueOf(numeric);
        if(num == 0 || numeric.startsWith("0")){
            return 0;
        } else {
            numeric = String.valueOf(num);
        }

        if(numeric.length() == 1){
            return numeric.length();
        } else if(numeric.length() == 2){

            if(num >= last || num % 10 == 0) {
                return 1 + modifier;
            } else {
                return 2 + modifier;
            }
        } else {
            return howManyWaysToGetAWord(numeric.substring(0,2), -1) +
                    howManyWaysToGetAWord(numeric.substring(1), 0);
        }
    }
}
