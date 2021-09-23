package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrieTest {

    private Trie subject;

    @BeforeEach
    void setUp() {
        subject = new Trie();
    }

    @Test
    void canInsertOneWord() {
        // GIVEN
        String word = "apple";
        String startsWith = "app";
        String notFindStartWith = "apl";
        // WHEN
        subject.insert(word);
        // THEN
        assertTrue(subject.search(word));
        assertTrue(subject.startsWith(startsWith));
        assertFalse(subject.startsWith(notFindStartWith));
    }

    @Test
    void canInsertThreeWords() {
        // GIVEN
        String word1 = "apple";
        String word2 = "pinapple";
        String word3 = "appleton";
        String startsWith = "app";
        String notFindStartWith = "apl";
        // WHEN
        subject.insert(word1);
        subject.insert(word2);
        subject.insert(word3);
        // THEN
        assertTrue(subject.search(word1));
        assertTrue(subject.search(word2));
        assertTrue(subject.search(word3));
        assertTrue(subject.startsWith(startsWith));
        assertFalse(subject.startsWith(notFindStartWith));
    }

    @Test
    void canInsertNWords() {
        // GIVEN
        String word1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapple";
        String word2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapinapple";
        String word3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaappleton";
        String startsWith = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String notFindStartWith = "apl";
        // WHEN
        subject.insert(word1);
        subject.insert(word2);
        subject.insert(word3);
        // THEN
        assertTrue(subject.search(word1));
        assertTrue(subject.search(word2));
        assertTrue(subject.search(word3));
        assertTrue(subject.startsWith(startsWith));
        assertFalse(subject.startsWith(notFindStartWith));
    }
}