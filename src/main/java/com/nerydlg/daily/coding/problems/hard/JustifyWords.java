package com.nerydlg.daily.coding.problems.hard;

import java.util.ArrayList;
import java.util.List;

public class JustifyWords {
    public List<String> fullJustify(String[] words, int maxWidth) {
        //int count = 0;
        List<String> result = new ArrayList<>();
        int i = 0;

        while( words.length > 0) {
            int count = 0;
            List<String> listOfWords = new ArrayList<>();
            //result.add(getNextLine(words, maxWidth));
            while(i < words.length && count + words[i].length() < maxWidth) {
                count += words[i].length() + 1;
                listOfWords.add(words[i]);
                i++;
            }
            if(listOfWords.size() > 0 ) {
                result.add(expandString(listOfWords, maxWidth));
            }
        }
        return result;
    }

    public String expandString(List<String> words, int maxWidth) {
        int spacesBetween = words.size()-1;
        int n = 0;
        if(spacesBetween > 0) {
            int currentSize = words.stream()
                    .map(str -> str.length())
                    .reduce(0, (acc, curr) -> acc += curr);
            int numOfSpaces = (maxWidth - currentSize) / spacesBetween;
            int extraSpaces = (maxWidth - currentSize) % spacesBetween;
            StringBuilder sb = new StringBuilder();

            System.out.println("currentSize = "+ currentSize + " words = " + words.size() );
            for(int i = 0; i < words.size(); i++) {
                n = numOfSpaces + ((extraSpaces > 0)? 1 : 0);
                System.out.println("%1$-"+ n + "s");
                sb.append(String.format("%1$-"+ n + "s", words.get(i)));
                extraSpaces--;
            }
            return sb.toString();
        } else {
            n = maxWidth - words.get(0).length();
            return String.format("%1$-" + n + "s", words.get(0));
        }
    }
}
