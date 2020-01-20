package com.nerydlg.daily.coding.problems.hard;

public class ImplementRegex {

    public boolean isMatch(String s, String p) {
        if ( s == null || p == null )return false;

        String[] stringSplitted = s.split("");
        String[] patternSplitted = p.split("");
        int wordIndex = 0;
        int pattIndex = 0;
        String patternCh, wordCh;
        boolean hasFrecuencyModifier = hasFrecuencyModifier(patternSplitted, pattIndex);
        while (pattIndex < patternSplitted.length &&
                wordIndex < stringSplitted.length) {
            patternCh = patternSplitted[pattIndex];
            wordCh = stringSplitted[wordIndex];

            if(patternCh.equals(wordCh) || patternCh.equals(".")) {
                wordIndex++;
                if(!hasFrecuencyModifier) {
                    pattIndex++;
                    hasFrecuencyModifier = hasFrecuencyModifier(patternSplitted, pattIndex);
                }
            } else {
                if(hasFrecuencyModifier && hasNext(patternSplitted, pattIndex+1)) {
                    String aux = patternSplitted[pattIndex];
                    pattIndex+=2;
                    hasFrecuencyModifier = hasFrecuencyModifier(patternSplitted, pattIndex);
                } else {
                    return false;
                }
            }
        }

        return wordIndex == stringSplitted.length &&
                (hasFrecuencyModifier ? pattIndex+2 : pattIndex) == patternSplitted.length;
    }

    private boolean hasNext(String[] arr, int index) {
        return index+1 < arr.length;
    }

    private boolean hasFrecuencyModifier(String[] pattern, int currIndex) {
        if (currIndex+1 >= pattern.length){
            return false;
        }
        if(pattern[currIndex+1].equals("*")) {
            return true;
        }
        return false;
    }
}
