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
