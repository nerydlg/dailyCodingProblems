package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TravelsTest {

    Travels travels = new Travels();

    @Test
    void GetMinimumCost() {
        int numberOfCities = 10;
        int[][] flights = new int[][]{{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},
        {1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},
        {5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        int src = 6;
        int dst = 0;
        int k = 7;
        int cost = travels.findCheapestPrice(numberOfCities, flights, src, dst, k);
        System.out.println(cost);
        assertEquals(14, cost);
    }
}