package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

    static class Node {
        int val;
        int count;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.count = 1;
            this.next = null;
            this.prev = null;
        }

        public Node() {

        }
    }

    private final Node head = new Node();
    private final Node tail = new Node();
    private final Map<Integer, Node> map = new HashMap<>();

    public FirstUnique(int[] nums) {
        head.next = tail;
        tail.prev = head;
        if(nums != null) {
            for(int i = 0; i < nums.length; i++) {
                add(nums[i]);
            }
        }
    }

    public int showFirstUnique() {
        Node node = head.next;
        if(node == tail || node.count > 1) {
            return -1;
        } else {
            return node.val;
        }
    }

    public void add(int value) {
        Node node = map.get(value);
        if(node == null) {
            Node newNode = new Node(value);
            addFirst(newNode);
            map.put(value, newNode);
        } else {
            remove(node);
            node.count++;
        }
    }

    private void addFirst(Node node) {
        Node prev = tail.prev;
        node.prev = prev;
        node.next = prev.next;

        prev.next = node;
        tail.prev = node;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        // they can be null if they appear more than 2 times
        if(prev != null) {
            prev.next = next;
        }
        if(next != null) {
            next.prev = prev;
        }

        node.next = null;
        node.prev = null;
    }

}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */