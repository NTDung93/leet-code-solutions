package com.example.demo.solved.slidingwindow;

public class BestTimeToBuyAndSellStock {
//    Input: prices = [10,1,5,6,7,1]
//    Output: 6

    public int maxProfit(int[] prices) {
        int buy = prices[0], maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

        return maxProfit;
    }
}