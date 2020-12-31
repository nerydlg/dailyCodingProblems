package com.nerydlg.daily.coding.problems.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IslandShapes {


    private Set<List<List<Integer>>> shapes;
    private int[][] myGrid;
    private int rows;
    private int cols;
    private int[][] movs = new int[][]{ {1,0}, {0, 1}, {-1, 0}, {0, -1}};

    public int numDistinctIslands(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        myGrid = grid;
        rows = grid.length;
        cols = grid[0].length;
        shapes = new HashSet<>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    StringBuilder key = new StringBuilder();

                }
            }
        }
        return shapes.size();
    }

    public void dfs(int row, int col, int rbase, int cbase, StringBuilder key) {
        if ((row >= 0 && row < rows) && (col >= 0 && col < cols)) {
            return;
        }
        key.append((row - rbase) + "_"+(col - cbase));
    }

}
