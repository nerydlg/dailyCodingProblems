package com.nerydlg.daily.coding.problems.medium;

/**
 *  [[1, -1,  -1, -1]
 *  [ 0,  1,  1, 1 ]
 *  [ 0,  1,  0, 0]]
 *
 */

public class FourInLine {
                                                // tl       tr      r       l        bl       br     b
    private static final int[][] directions = {{-1, -1}, {-1, 1}, {0, 1}, {0, -1}, {1, -1}, {1, 1}, {1, 0}};
    private static final int[] opposite = {5, 4, 3, 2, 1, 0};

    public int victoryChecker(int x, int y, int player, int[][] matrix) {
        return recursiveWinnerCheck(x, y, player, matrix, 1, null);
    }

    private int recursiveWinnerCheck(int x, int y, int player, int[][] matrix, int next, int[] direction) {
        if(next == 4){
            return player;
        } else if(direction == null) {
            for(int i = 0; i < directions.length; i++) {
                int row = y + directions[i][0];
                int col = x + directions[i][1];
                if(row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
                    int val = matrix[row][col];
                    if(val == player) {
                        int increment = getIncrementBasedOnDirection(i, matrix, x, y, player);
                        int result = recursiveWinnerCheck(col, row, player, matrix, next+increment, directions[i]);
                        if(result != -1) return result;
                    }
                }
            }
        } else {
            int row = y + direction[0];
            int col = x + direction[1];
            if(row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
                if (matrix[row][col] == player) {
                    return recursiveWinnerCheck(col, row, player, matrix, next + 1, direction);
                }
            }
        }
        return -1;
    }

    public int getIncrementBasedOnDirection(int directionIndex, int[][] matrix, int x, int y, int player) {
        if(directionIndex == 6) return 1;
        int row = y + directions[opposite[directionIndex]][0];
        int col = x + directions[opposite[directionIndex]][1];
        if(row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
            return matrix[row][col] == player ? 2 : 1;
        } else {
            return 1;
        }
    }
}
