package com.nerydlg.daily.coding.problems.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordLadderTest {

  WordLadder subject;

  @Test
  void canFindLengthOfLetter() {
    // GIVEN
    String beginWord = "hit";
    String endWord = "cog";
    List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
    int expected = 5;
    subject = new WordLadder();
    // WHEN
    int actual = subject.letterLength(beginWord, endWord, wordList);

    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void returnZeroWhenCannotFindLetter() {
    // GIVEN
    String beginWord = "hit";
    String endWord = "cot";
    List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
    int expected = 0;
    subject = new WordLadder();
    // WHEN
    int actual = subject.letterLength(beginWord, endWord, wordList);

    // THEN
    assertEquals(expected, actual);
  }
}