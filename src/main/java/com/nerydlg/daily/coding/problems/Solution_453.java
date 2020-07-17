package com.nerydlg.daily.coding.problems;

/*
Good morning! Here's your coding interview problem for today.

Given the root of a binary search tree, and a target K, return two nodes in the tree whose sum equals K.

For example, given the following tree and K of 20

    10
   /   \
 5      15
       /  \
     11    15

	 K = 15 Result = 10 + 5;

*/
import java.util.Arrays;
import java.util.Stack;

public class Solution_453 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(10, new TreeNode(5, null, null),
                new TreeNode(15, new TreeNode(11, null, null), new TreeNode(15, null, null)));
        Arrays.stream(findSumInTree(root, 15)).forEach(System.out::println);
    }

    public static int[] findSumInTree(TreeNode root, int k) {
        if(root == null) return null;
        TreeNode aux1 = null;
        TreeNode aux2 = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            aux1 = stack.pop();
            aux2 = aux1;
            //System.out.println("aux1 = "+aux1.val);
            int newK = k - aux1.val;
            if(aux1.left != null && aux1.val < k)
                stack.push(aux1.left);
            if(aux1.right != null && aux1.val < k)
                stack.push(aux1.right);
            while(aux2 != null){
                //System.out.println("aux2 = "+aux2.val);
                if(aux2.val > newK) {
                    //System.out.println("aux2 move left");
                    aux2 = aux2.left;
                } else if(aux2.val < newK) {
                    //System.out.println("aux2 move r/ight");
                    aux2 = aux2.right;
                } else{
                    //System.out.println("found!");
                    stack.clear();
                    System.out.println(stack.size());
                    break;
                }

            }

        }
        return new int[]{aux1.val, aux2.val};

    }

    //public int[] findSumInTree(TreeNode root, int k)
}
