package com.nerydlg.daily.coding.problems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * Given a dictionary of words and a string made up of those words (no spaces),
 * return the original sentence in a list. If there is more than one possible reconstruction,
 * return any of them. If there is no possible reconstruction, then return null.
 *
 * For example, given the set of words 'quick', 'brown', 'the', 'fox',
 * and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
 *
 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond',
 * and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
 *
 */

public class FindOriginalPhrase {

    public static void main(String[] args) {
        FindOriginalPhrase finder = new FindOriginalPhrase();
        finder.findOriginalPhrase(new String[]{"quick", "brown", "the", "fox"}, "thequickbrownfox").stream().forEach(System.out::println);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.isEmpty()) return true;
        if(wordDict.isEmpty()) return false;
        return false;
    }

    public List<String> findOriginalPhrase(String[] words, String phrase) {
        Map<String, int[]> existingWords = new HashMap<>();
        String word = null;
        int[] location = null;
        // get all existing words and it's boundaries
        for(int i = 0; i < words.length; i++) {
            word = words[i];
            location = boundariesOf(word, phrase);
            if(location != null) {
                existingWords.put(word, location);
            }
        }

        // order them by boundaries
        List<String> result = new ArrayList<>(existingWords.size());
        Set<String> keys = existingWords.keySet();
        for(String key : keys) {
            location = existingWords.get(key);
            if(location[0] == 0) {
                result.set(0, key); // is the first one
            } else if (location[1] == phrase.length()-1) {
                result.set(result.size()-1, key); // is the last one
            } else {

            }
        }
        return result;
    }

    public int[] boundariesOf(String word, String phrase) {
        int[] result = null;
        String[] patterns = new String[]{word+"\\B", "\\B"+word+"\\B", "\\B"+word};
        Pattern pattern = null;
        Matcher matcher = null;
        for(int i = 0; i < 3; i++) {
            pattern = Pattern.compile(patterns[i]);
            matcher = pattern.matcher(phrase);
            if (matcher.find()) {
                result = new int[]{matcher.start(), matcher.end()};
                break;
            }
        }
        return result;
    }
}
