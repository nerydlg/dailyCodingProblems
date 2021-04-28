package com.nerydlg.daily.coding.problems.medium;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *  find the path shorterst path from the point AA to point EB you onlu
 *  can step on the 1's and you can move it only to up, down, left, right
 * [  A  B  C  D  E
 * A [1, 0, 0, 0, 1]
 * B [1, 1, 1, 1, 0]
 * C [1, 1, 0, 1, 1]
 * D [1, 0, 0, 1, 0]
 * E [1, 1, 1, 1, 1]
 * ]
 *
 */
public class ShortestPathMatrix {

    private int[][] matrix;
    private Set<String> visited;
    // directions
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int stepsToReachThePoint(int[][] matrix, int[] src, int[] dest) {
        // first initialize all the things
        this.matrix = matrix;
        visited = new HashSet<>();
        return bfs(src, dest);
    }

    private int bfs(int[] src, int[] dest) {
        LinkedList<int[]> queue = new LinkedList<>();
        int min = -1;
        // convert to new element it work better if we create an object
        int[] start = {src[0], src[1], 0};
        // insert first element into the queue
        queue.add(start);
        // mark element as visited in the set
        visited.add("["+src[0]+", "+src[1]+"]");

        while(!queue.isEmpty()) {
            // extract the head from the queue
            int[] curr = queue.poll();

            // validate if we already reach the point
            if(reachPoint(curr, dest)) {
                min = curr[2];
                break;
            }
            // if don't we are going to continue adding childs into the queue
            for(int i = 0; i < directions.length; i++) {
                // calculate new x, y and the step
                int ny = directions[i][0] + curr[0];
                int nx = directions[i][1] + curr[1];
                int[] next = new int[]{ny, nx, curr[2] + 1};
                // string created to know if it is visited
                String key = "["+ny+", "+nx+"]";
                // only add childs that are not being visited and that are 1
                if(isInside(nx, ny) && matrix[ny][nx] == 1 && !visited.contains(key)) {
                    queue.offer(next);
                    visited.add(key);
                }
            }
        }
        // return minimum
        return min;
    }

    private boolean reachPoint(int[] a, int[] b) {
        return a[0] == b[0] && b[1] == a[1];
    }

    private boolean isInside(int row, int col) {
        return row >= 0 && row < matrix.length
                && col >= 0 && col < matrix[row].length;
    }
}
