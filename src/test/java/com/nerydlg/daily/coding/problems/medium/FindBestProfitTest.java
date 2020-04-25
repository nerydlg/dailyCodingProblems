package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindBestProfitTest {

    private FindBestProfit subject = new FindBestProfit();

    @Test
    void findMaxProfit() {
        int[] input = new int[]{7, 1, 5, 3, 6, 4};
        int result = subject.maxProfit(input);
        assertEquals(7, result);
    }
}