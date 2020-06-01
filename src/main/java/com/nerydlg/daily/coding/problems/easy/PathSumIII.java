package com.nerydlg.daily.coding.problems.easy;

import com.nerydlg.daily.coding.problems.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    private Map<Integer, Integer> sums = new HashMap<>();
    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        sums.put(0, 1);
        pathSum(root, sum, 0);
        return count;
    }

    public void pathSum(TreeNode root, int sum, int prev) {
        if(root == null) return;
        prev += root.val;
        if(sums.containsKey(prev - sum)) {
            count += sums.get(prev - sum);
        }
        sums.put(prev, sums.getOrDefault(prev, 0) + 1);
        pathSum(root.left, sum, prev);
        pathSum(root.right, sum, prev);
        sums.put(prev, sums.getOrDefault(prev, 0) - 1);
        if(sums.get(prev) == 0) {
            sums.remove(prev);
        }
    }

}
