package com.nerydlg.daily.coding.problems.hard;

import java.util.List;

public class ChangeCalculator {

    class Change {
        long coinOf2 = 0;
        long billOf5 = 0;
        long billOf10 = 0;
    }

    public Change giveChangeFrom(long amount) {
        int[] coinsAndBills = new int[]{10, 5, 2};
        return giveChange(amount, coinsAndBills, 0, new Change());
    }

    public Change giveChange(long amount, int[] coinsAndBills, int currentValue, Change change) {
        if(amount <= 1 || currentValue > coinsAndBills.length) return null;
        long updatedAmount =  amount - coinsAndBills[currentValue];
        Change currentChange = null;
        if(updatedAmount == 0){
            return updateChange(change, currentValue);
        } else if(updatedAmount > 0) {
           if(updatedAmount >= coinsAndBills[currentValue]) {
               currentChange = giveChange(updatedAmount, coinsAndBills, currentValue, updateChange(change, currentValue));
           } else {
               currentChange = giveChange(updatedAmount, coinsAndBills, currentValue++, updateChange(change, currentValue));
               if(currentChange == null) {
                   currentChange = giveChange(amount, coinsAndBills, currentValue++, change);
               }
           }
        } else {
            currentChange = giveChange(amount, coinsAndBills, currentValue++, change);
        }

        return currentChange;
    }

    public int giveChange(long amount, int[] coinsAndBills, int currentValue, int coins) {
        if(amount < 0 || coinsAndBills == null || currentValue > coinsAndBills.length) return -1;
        long updatedAmount =  amount - coinsAndBills[currentValue];
        int newCoins = 0;
        if(updatedAmount == 0){
            return coins+1;
        } else if(updatedAmount > 0) {
            if(updatedAmount >= coinsAndBills[currentValue]) {
                newCoins = giveChange(updatedAmount, coinsAndBills, currentValue, coins+1);
            } else {
                newCoins = giveChange(updatedAmount, coinsAndBills, currentValue+1, coins+1);
                if(newCoins == -1) {
                    newCoins = giveChange(amount, coinsAndBills, currentValue+1, coins);
                }
            }
        } else {
            newCoins = giveChange(amount, coinsAndBills, currentValue+1, coins);
        }

        return newCoins;
    }

    private Change updateChange(Change change, int currentValue) {
        if(change == null) return null;
        Change newChange = new Change();
        newChange.billOf10 = change.billOf10;
        newChange.billOf5 = change.billOf5;
        newChange.coinOf2 = change.coinOf2;
        switch (currentValue) {
            case 0: newChange.billOf10++;
            break;
            case 1: newChange.billOf5++;
            break;
            case 2: newChange.coinOf2++;
            break;
            default: return null;
        }
        return newChange;
    }



}
