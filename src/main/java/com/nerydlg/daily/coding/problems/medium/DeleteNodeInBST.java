package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.TreeNode;

public class DeleteNodeInBST {

    public TreeNode deleteNode(TreeNode root, int key) {
        // if element doesn't exists
        if(root == null) {
            return null;
        }
        // if k is higher it should be in the right
        if(key > root.val) {
            root.right = deleteNode(root.right, key);
            // if key is lower than current val then is on the left
        }else if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            // found it!
            // if leaf delete it
            if(isLeaf(root)) {
                root = null;
                // if no leaf and have right node then interchange by successor
            } else if(root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
                // if no leaf and no right node then interchange by the predecessor
            } else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    private int predecessor(TreeNode root) {
        root = root.left;
        while(root.right != null) root = root.right;
        return root.val;
    }

    private int successor(TreeNode root) {
        root = root.right;
        while(root.left != null) root = root.left;
        return root.val;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
