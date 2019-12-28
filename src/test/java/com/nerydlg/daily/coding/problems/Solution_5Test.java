package com.nerydlg.daily.coding.problems;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_5Test {

    @Test
    void rob_test1() {
        int[] input = {1, 3, 1, 3, 100};

        assertEquals( 103, Solution_5.rob(input));
    }
}