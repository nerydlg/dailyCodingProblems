package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    class TrieNode {
        int count;
        Map<Character, TrieNode> children;
        boolean isWord;

        public TrieNode() {
            this.count = 0;
            this.children = new HashMap<>();
            this.isWord = false;
        }

        public TrieNode(Character c) {
            this.count = 0;
            this.isWord = false;
            this.children = new HashMap<>();
            this.children.put(c, new TrieNode());
        }
    }

    TrieNode head;

    /** Initialize your data structure here. */
    public Trie() {
        this.head = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode aux = this.head;
        for(int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if(aux.children.containsKey(ch)) {
                aux = aux.children.get(ch);
                aux.count++;
            } else {
                TrieNode newChild = new TrieNode(ch);
                aux.children.put(ch, newChild);
                aux = newChild;
            }
        }
        aux.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = find(prefix);
        return node != null;
    }

    private TrieNode find(String word) {
        TrieNode aux = this.head;
        for(int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if(aux.children.containsKey(ch)) {
                aux = aux.children.get(ch);
            } else {
                return null;
            }
        }
        return aux;
    }
}
