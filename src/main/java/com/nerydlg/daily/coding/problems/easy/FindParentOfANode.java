package com.nerydlg.daily.coding.problems.easy;


import com.nerydlg.daily.coding.problems.common.TreeNode;

/*
Given a node in a binary search tree, return the next bigger element, also known as the inorder successor.

For example, the inorder successor of 22 is 30.

   10
  /  \
 5    30
     /  \
   22    35
You can assume each node has a parent pointer.
 */
public class FindParentOfANode {


    public TreeNode findParent(TreeNode root, TreeNode k) {
        if ((root.left != null && root.left.val == k.val)
                || (root.right != null && root.right.val == k.val)) {
            return root;
        }

        if(k.val > root.val) {
            return findParent(root.right, k);
        } else {
            return findParent(root.left, k);
        }
    }
}
