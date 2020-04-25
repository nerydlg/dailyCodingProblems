package com.nerydlg.daily.coding.problems.medium;

import java.util.Map;
import java.util.HashMap;

class LRUCache {

    private Node head;
    private Node tail;
    private int capacity;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node();
        this.tail = new Node();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        int val = -1;
        if(node != null) {
            remove(node);
            val = node.val;
            add(node);
        }
        return val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if(map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;

            add(newNode);
            map.put(key, newNode);
        }
    }

    public void add(Node node) {
        Node next = head.next;
        head.next = node;
        next.prev = node;
        node.prev = head;
        node.next = next;
    }

    public void remove(Node node) {
        Node next = node.next;
        Node prev = node.prev;

        next.prev = prev;
        prev.next = next;
    }

    class Node {
        int key;
        int val;
        Node next;
        Node prev;
    }
}