package com.nerydlg.daily.coding.problems.hard;

import java.util.*;

public class WordLadder {

  public int letterLength(String beginWord, String endWord, List<String> wordList) {
    Queue<String> queue = new LinkedList<>();
    Set<String> words = new HashSet<>(wordList);
    int level = 0;

    if(!words.contains(endWord)) {
      return 0;
    }

    words.remove(beginWord);
    queue.add(beginWord);
    while(!queue.isEmpty()) {
      int size = queue.size();
      level++;
      // iterate for the queue size at that moment
      for(int i = 0; i < size; i++) {
        String currentWord = queue.poll();
        // if current word is equal to end word return level
        if (currentWord.equals(endWord)) {
          return level;
        }
        // look for the neighbors of the given word
        List<String> neighbors = getNeigborsFrom(currentWord);
        for (String neighbor : neighbors) {
          if (words.contains(neighbor)) {
            words.remove(neighbor);
            queue.add(neighbor);
          }
        }
      }
    }
    return 0;
  }

  private List<String> getNeigborsFrom(String word) {
    List<String> words = new ArrayList<>();
    char[] chars = word.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      char original = chars[i];
      for(char c = 'a'; c <= 'z'; c++) {
        chars[i] = c;
        String newWord = new String(chars);
        words.add(newWord);
      }
      chars[i] = original;
    }
    return words;
  }

}
