package com.nerydlg.daily.coding.problems.common;

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

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("{")
          .append("count = ")
          .append(count)
          .append(", children = ")
          .append(children)
          .append(", isWord = ")
          .append(isWord)
          .append("}");
      return sb.toString();
    }
  }

  private final TrieNode head;

  public Trie() {
    this.head = new TrieNode();
  }

  public void addWord(String s) {
    int n = s.length();
    TrieNode aux = head;
    for(int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if(aux.children.containsKey(ch)) {
        TrieNode exists = aux.children.get(ch);
        exists.count++;
        aux = exists;
      } else {
        TrieNode newNode = new TrieNode();
        aux.children.put(ch, newNode);
        newNode.count = 1;
        aux = newNode;
      }
    }
    aux.isWord = true;
  }

  public TrieNode getHead() {
    return this.head;
  }

  @Override
  public String toString() {
    return head.toString();
  }
}
