package com.nerydlg.daily.coding.problems.util;

import com.nerydlg.daily.coding.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeSerializer {


    public static Integer[] serialize(TreeNode root) {
        if(root == null) return new Integer[0];
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode aux = null;
        while(!queue.isEmpty()) {
            aux = queue.poll();
            Integer val = aux == null? null : aux.val;

            values.add(val);
            if(aux != null && (aux.left != null || aux.right != null)) {
                queue.add(aux.left);
                queue.add(aux.right);
            }
        }
        return values.toArray(new Integer[values.size()]);
    }
}
