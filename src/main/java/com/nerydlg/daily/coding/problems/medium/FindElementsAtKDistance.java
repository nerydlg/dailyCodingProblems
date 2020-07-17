package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindElementsAtKDistance {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        createGraph(root, map, null);
        int deep = 0;
        int currSize = 1, counter = 0;
        Set<Integer> visited = new HashSet();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target.val);
        while(deep < K && !queue.isEmpty()){
            Integer curr = queue.poll();
            visited.add(curr);

            List<Integer> childs = map.get(curr);

            for(Integer child : childs) {
                if(!visited.contains(child)){
                    queue.offer(child);
                    counter++;
                }
            }

            currSize--;
            if(currSize == 0) {
                deep++;
                currSize = counter;
                counter  = 0;
            }
        }
        return new ArrayList(queue);
    }

    public void createGraph(TreeNode root, Map<Integer, List<Integer>> map, Integer parent) {
        if(root == null){
            return;
        }
        List<Integer> list = map.containsKey(root.val)? map.get(root.val) : new ArrayList<>();
        if(root.left != null) {
            list.add(root.left.val);
            createGraph(root.left, map, root.val);
        }
        if(parent != null){
            list.add(parent);
        }
        if(root.right != null) {
            list.add(root.right.val);
            createGraph(root.right, map, root.val);
        }
        map.put(root.val, list);
    }
}
