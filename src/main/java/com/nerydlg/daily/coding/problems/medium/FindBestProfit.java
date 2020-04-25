package com.nerydlg.daily.coding.problems.medium;

public class FindBestProfit {

    public int maxProfit(int[] prices) {
        return maxProfit(prices, 0, 0);
    }

    public int maxProfit(int[] prices, int profit, int startAt) { // { 7, 1, 5, 3, 6, 4}
        System.out.println("startAt = "+ startAt + " profit =" + profit);
        if(prices == null || startAt >= prices.length - 1) return profit;
        int buy = buyAtDay(prices, startAt); // buy = 1
        return findBestProfit(prices, buy+1, prices[buy], profit); //
    }

    public int buyAtDay(int[] prices, int startAt) { // startAt = 0
        int day = -1;
        int min = Integer.MAX_VALUE;
        for(int i = startAt; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
                day = i; // day = 1
            }
        }
        return day;
    }

    public int findBestProfit(int[] prices, int startAt, int boughtAt, int profit) { // startAt = 1, boughtAt = 1
        int maxProfit = Integer.MIN_VALUE;
        int currentProfit = 0;
        for(int i = startAt; i < prices.length; i++) { // i = 2
            if(prices[i] > boughtAt) {
                currentProfit = profit  + maxProfit(prices, prices[i] - prices[startAt-1], i+1);
                if(currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

}
