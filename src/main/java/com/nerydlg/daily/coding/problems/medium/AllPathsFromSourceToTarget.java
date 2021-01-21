package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    private int[][] graph;
    private int lastNode = 0;
    private List<List<Integer>> results;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        lastNode = graph.length-1;
        this.graph = graph;
        this.results = new ArrayList<List<Integer>>();

        LinkedList<Integer> path = new LinkedList<Integer>();
        path.add(0);

        backtrack(path, 0);
        return results;
    }

    private void backtrack(LinkedList<Integer> path, int curr) { // 3 [0, 2, 3]
        if(curr == this.lastNode) {
            this.results.add(new ArrayList<Integer>(path)); // [[0,1,3], [0,2,3] ]
            return;
        }
        // explore the neighbors
        for(int nextNode : this.graph[curr]) {
            path.add(nextNode);
            backtrack(path, nextNode);
            // remove previous before next iteration
            path.removeLast();
        }
    }
}
