package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FourInLineTest {

    private static int[][] matrix = new int[5][5];
    private FourInLine subject = new FourInLine();

    @BeforeAll
    static void setUp() {
        for(int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], -1);
        }
    }

    @Test
    void WhenPlayerOneMakeAMovementCheckIfWon_afterFirstMove() {
        // GIVEN
        int x = 3;
        int y = matrix.length-1;
        int player = 0;
        // WHEN
        matrix[x][y] = player;
        // THEN
        assertEquals(-1, subject.victoryChecker(x, y, player, matrix));
    }

    @Test
    void WhenPlayerTwoMakeAMovementCheckIfWon_afterSecondMove() {
        // GIVEN
        int x = 2;
        int y = matrix.length-1;
        int player = 1;
        // WHEN
        matrix[x][y] = player;
        // THEN
        assertEquals(-1, subject.victoryChecker(x, y, player, matrix));
    }

    @Test
    void WhenPlayerOneMakeAMovementCheckIfWon_afterSomeMoves() {
        // GIVEN
        /*
         [
            [-1, -1, -1, -1, -1],
            [-1, 1, 1, 0, -1],
            [ 1, 1, 0, 0, 0],
            [ 1, 0, 0, 0, 1],
            [ 0, 1, 0, 1, 0]
         ]
         */
        // buttom
        matrix[matrix.length-1][0] = 0;
        matrix[matrix.length-1][1] = 1;
        matrix[matrix.length-1][4] = 0;
        // next
        matrix[matrix.length-2][0] = 1;
        matrix[matrix.length-2][1] = 0;
        matrix[matrix.length-2][2] = 0;
        matrix[matrix.length-2][3] = 0;
        matrix[matrix.length-2][4] = 1;

        // next
        matrix[matrix.length-3][0] = 1;
        matrix[matrix.length-3][1] = 1;
        matrix[matrix.length-3][2] = 0;
        matrix[matrix.length-3][3] = 0;
        matrix[matrix.length-3][4] = 0;

        // next
        matrix[matrix.length-4][0] = -1;
        matrix[matrix.length-4][1] = 1;
        matrix[matrix.length-4][2] = 1;
        matrix[matrix.length-4][3] = -1;
        matrix[matrix.length-4][4] = -1;

        int x = 3;
        int y = 1;
        int player = 0;
        // WHEN
        matrix[x][y] = player;
        // THEN
        assertEquals(0, subject.victoryChecker(x, y, player, matrix));
    }

    @Test
    void WhenPlayerTwoMakeAMovementCheckIfWon_afterSomeMoves() {
        // GIVEN
        /*
         [
            [-1, -1, -1, -1, -1],
            [-1, 1, 1, 0, -1],
            [ 1, 1, 1, 0, 0 ],
            [ 1, 0, 0, 1, 1 ],
            [ 0, 1, 0, 1, 1 ]
         ]
         */
        // buttom
        matrix[matrix.length-1][0] = 0;
        matrix[matrix.length-1][1] = 1;
        matrix[matrix.length-1][4] = 1;
        // next
        matrix[matrix.length-2][0] = 1;
        matrix[matrix.length-2][1] = 0;
        matrix[matrix.length-2][2] = 0;
        matrix[matrix.length-2][3] = 1;
        matrix[matrix.length-2][4] = 1;

        // next
        matrix[matrix.length-3][0] = 1;
        matrix[matrix.length-3][1] = 1;
        matrix[matrix.length-3][2] = 1;
        matrix[matrix.length-3][3] = 0;
        matrix[matrix.length-3][4] = 0;

        // next
        matrix[matrix.length-4][0] = -1;
        matrix[matrix.length-4][1] = 1;
        matrix[matrix.length-4][2] = 1;
        matrix[matrix.length-4][3] = -1;
        matrix[matrix.length-4][4] = -1;

        int x = 1;
        int y = 1;
        int player = 1;
        // WHEN
        matrix[x][y] = player;
        // THEN
        assertEquals(1, subject.victoryChecker(x, y, player, matrix));
    }

    @Test
    void WhenPlayerTwoMakeAMovementCheckIfWon_afterSomeMoves_2() {
        // GIVEN
        /*
         [
            [-1, -1, -1, -1, -1],
            [-1, -1, -1, -1, -1],
            [ 1, 1, -1, 1, 1],
            [-1, 1, 0, 1, 1 ],
            [ 0, 1, 0, 1, 1 ]
         ]
         */
        // buttom
        matrix[matrix.length-1][0] = 0;
        matrix[matrix.length-1][1] = 1;
        matrix[matrix.length-1][2] = 0;
        matrix[matrix.length-1][3] = 1;
        matrix[matrix.length-1][4] = 1;
        // next
        matrix[matrix.length-2][0] = -1;
        matrix[matrix.length-2][1] = 1;
        matrix[matrix.length-2][2] = 0;
        matrix[matrix.length-2][3] = 1;
        matrix[matrix.length-2][4] = 1;

        // next
        matrix[matrix.length-3][0] = 1;
        matrix[matrix.length-3][1] = 1;
        matrix[matrix.length-3][2] = -1;
        matrix[matrix.length-3][3] = 1;
        matrix[matrix.length-3][4] = 1;

        // next
        matrix[matrix.length-4][0] = -1;
        matrix[matrix.length-4][1] = -1;
        matrix[matrix.length-4][2] = -1;
        matrix[matrix.length-4][3] = -1;
        matrix[matrix.length-4][4] = -1;

        int x = 2;
        int y = 2;
        int player = 1;
        // WHEN
        matrix[x][y] = player;
        // THEN
        assertEquals(1, subject.victoryChecker(x, y, player, matrix));
    }
}