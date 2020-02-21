package com.nerydlg.daily.coding.problems;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_99Test {

    @Test
    void BasicValidation() {
        int[][] servers = {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 }
        };
/** day = 3
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 }
 */
        assertEquals(3, Solution_99.howManyDaysToUpdate(servers, 4, 4));
    }

    @Test
    void NeverUpdateAll() {
        int[][] servers = {
                { 0, 0 },
                { 0, 0 }
        };
/** day = 3
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 },
 * { 1, 1, 1, 1 }
 */
        assertEquals(0, Solution_99.howManyDaysToUpdate(servers, 2, 2));
    }


    @Test
    void onlyOneServerUpdatedAtTheBeginning() {
        int[][] servers = {
                { 0, 0, 0, 1 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };
/** day = 4
 * { 0, 0, 0, 0 },
 * { 0, 0, 0, 0 },
 * { 0, 0, 0, 0 },
 * { 0, 0, 0, 0 }
 */
        assertEquals(6, Solution_99.howManyDaysToUpdate(servers, 4, 4));
    }
}