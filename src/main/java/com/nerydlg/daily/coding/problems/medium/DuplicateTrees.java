package com.nerydlg.daily.coding.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateTrees {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        if(root == null) return new ArrayList<>();
        Set<String> result = new HashSet<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        Map<String, TreeNode> map = new HashMap();
        queue.push(root);
        TreeNode current = null;
        String strVal = null;
        while(!queue.isEmpty()) {
            current = queue.pollFirst();
            strVal = treeToStringOneLevel(current);
            if(map.containsKey(strVal)) {
                result.add(strVal);
            }else{
                map.put(strVal, current);
            }

            if(current.left != null) {
                queue.push(current.left);
            }
            if(current.right != null) {
                queue.push(current.right);
            }

        }
        return result.stream().map(map::get).collect(Collectors.toList());
    }

    public String treeToStringOneLevel(TreeNode root) {
        if(root == null) return "#";
        return  root.val + ","+treeToStringOneLevel(root.left) +","+
                treeToStringOneLevel(root.right);
    }
}
