package com.nerydlg.daily.coding.problems.util;

import com.nerydlg.daily.coding.problems.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeDeserializer {

    public static TreeNode deserialize(Integer[] arr) {
        if(arr == null || arr.length == 0) return null;
        int i = 1;
        TreeNode root = new TreeNode(arr[0]);
        TreeNode aux = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty() && i < arr.length) {
            aux = queue.poll();
            aux.left = (i < arr.length && arr[i] != null)? new TreeNode(arr[i]) : null;
            i++;
            if(aux.left != null) {
                queue.add(aux.left);
            }
            aux.right = (i < arr.length && arr[i] != null)? new TreeNode(arr[i]) : null;
            i++;
            if(aux.right != null) {
                queue.add(aux.right);
            }
        }
        return root;
    }
}
