package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeRightSideView {

    public List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result, 0);
        return result;
    }

    public List<Integer> rightSideViewBFS(TreeNode root) {
        return bfs(root);
    }
    /**
     * DFS but in post order
     */
    public void dfs(TreeNode root, List<Integer> result, int currDeep) {
        // if null return;
        if(root == null) {
            return;
        }
        // if our result size is equal to currDeep then add the value
        if(result.size() == currDeep) {
            result.add(root.val);
        }
        // go to right and do the same thing
        dfs(root.right, result, currDeep + 1);
        // go to left and do the same thing
        dfs(root.left, result, currDeep + 1);
    }

    /**
     * Simple BFS algorithim
     * @param root
     * @return a list with the elements view from the right
     */
    public List<Integer> bfs(TreeNode root) {
        // initialize result
        List<Integer> result =  new ArrayList<>();
        if(root == null) {
            return result;
        }
        // initialize Queue
        LinkedList<TreeNode> queue = new LinkedList<>();
        // add root as first level
        queue.add(root);
        TreeNode curr = null;
        while(!queue.isEmpty()) {
            // get size of current level
            int levelSize = queue.size();
            // iterate over all the elements of the current size
            for(int i = 0; i < levelSize; i++) {
                curr = queue.poll();
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            // last element is the element most at the right
            result.add(curr.val);
        }
        return result;
    }
}
