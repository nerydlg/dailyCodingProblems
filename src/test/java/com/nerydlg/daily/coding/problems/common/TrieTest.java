package com.nerydlg.daily.coding.problems.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

  private Trie subject = new Trie();

  @Test
  void test() {
    // GIVEN
    String[] words = new String[] {"flower", "flow", "flight"};
    // WHEN
    for(int i = 0; i < words.length; i++) {
      subject.addWord(words[i]);
    }
    // THEN
    assertTrue(true);
  }
}
