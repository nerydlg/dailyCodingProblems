package com.nerydlg.daily.coding.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of pixels, return how many pixels
 * we have in every picture
 * a picture is a set of pixels adjacent to each other
 *  [
 *  [1, 1, 0, 1],
 *  [1, 1, 0, 0],
 *  [0, 0, 1, 1],
 *  [1, 0, 0, 0]
 *  ]
 *  output = [4, 1, 2, 1]
 *  */
public class Pixels {

    int[][] matrix;
    int[][] visited;
    int rows;
    int cols;

    int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public List<Integer> getPicturesFromPixels(int[][] matrix) {
        this.matrix = matrix;
        rows = matrix.length;
        cols = matrix[0].length;
        this.visited = new int[rows][cols];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < rows; i++ ) {
            for(int j=0; j < cols; j++) {
                int count = dfs(i, j, 0);
                if(count > 0) {
                    list.add(count);
                }
            }
        }
        return list;
    }

    private int dfs(int y, int x, Integer count) {
        if(this.matrix[y][x] == 0 || this.visited[y][x] != 0) {
            return count;
        } else {
            count++;
            this.visited[y][x] = 1;
        }

        for(int i = 0; i < directions.length; i++) {
            int nx = x + directions[i][0];
            int ny = y + directions[i][1];
            if(isInsideOfMatrix(nx, ny) && isPixelOnAndNotCounted(nx, ny)) {
                count = dfs(ny, nx, count);
            }
        }
        return count;
    }

    private boolean isPixelOnAndNotCounted(int x, int y) {
        return matrix[y][x] != 0 && visited[y][x] == 0;
    }

    private boolean isInsideOfMatrix(int x, int y) {
        return (y >= 0 && y < rows)
                && (x >= 0 && x < cols);
    }
}
