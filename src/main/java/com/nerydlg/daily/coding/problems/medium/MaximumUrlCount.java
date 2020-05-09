package com.nerydlg.daily.coding.problems.medium;

import java.util.Arrays;

public class MaximumUrlCount {

    public String[] getMaxmimumUrlCountBF(String[] usr1, String[] usr2) {
        if(usr1 == null || usr2 == null) return new String[0];
        int[] maxHelper = new int[]{-1, 0, 0};
        int i =0, j=0;
        while (i < usr1.length) {
            String userOne = usr1[i];
            j = 0;
            int auxi = i;
            boolean found=false;
            while(j < usr2.length ) {
                if( !userOne.equals(usr2[j]) ){
                    if(found)break;
                } else {
                    auxi++;
                    found = true;
                    if (maxHelper[0] < auxi - i) {
                        maxHelper[0] = auxi - i;
                        maxHelper[1] = i;
                        maxHelper[2] = auxi;
                    }
                    if(auxi < usr1.length) {
                        userOne = usr1[auxi];
                    } else {
                        break;
                    }
                }
                j++;
            }
            if(found){
                i =auxi;
            } else {
                i++;
            }
        }

        return Arrays.copyOfRange(usr1, maxHelper[1], maxHelper[2]);
    }
}
