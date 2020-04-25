package com.nerydlg.daily.coding.problems.easy;


public class FlipBinaryTree {


    static class Node {
        int val;
        Node right;
        Node left;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    public Node upsideDownBinaryTree(Node root) { // 4
        if(root == null) {
            return root; // null
        }
        System.out.println(root.val);
        Node head = upsideDownBinaryTree(root.left); // 2 head = 4
        System.out.println("head = " + head + " root = " + root.val);
        if( head == null) {
            head = new Node(root.val);
        } else {
            Node walkerR = head;
            while(walkerR.right != null) {
                walkerR = walkerR.right;
            }
            walkerR.left = root.right;
            walkerR.right = root;
            root.left = null;
            root.right = null;
        }
        return head;
    }
}
