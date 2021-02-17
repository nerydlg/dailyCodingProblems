package com.nerydlg.daily.coding.problems.coursera;

/**
 * Lazy version of quick find it doesn't validate
 * if points are part of the original array.
 */
public class QuickFind {

    private int[] ids;

    public QuickFind(int n) {
        ids = new int[n];
        for(int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public boolean find(int p, int q) {
        return ids[p] == ids[q];
    }

    public void union(int p, int q) {
        int pid = ids[p];
        for(int i=0; i < ids.length; i++) {
            if(pid == ids[i]) {
                ids[i] = ids[q];
            }
        }
    }
    
}
