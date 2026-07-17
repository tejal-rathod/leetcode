package com.leetcode.soluton.sliding.window;

public class BuySellStock {

    public static void main(String[] args) {

        maxProfit(new int[]{7,1,5,3,6,4});

    }

    public static int maxProfit(int[] prices) {

        int left = 0;      // Buy day
        int right = 1;  // Sell day
        int maxProfit = 0;
        while (right < prices.length) {
            // Profitable transaction
            if (prices[right] > prices[left]) {

                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {

                // Found a cheaper buying day
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
