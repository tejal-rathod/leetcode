package com.leetcode.soluton.array.easy;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {

       System.out.println(maxProfit(new int []{7,1,5,3,6,4}));

    }

    public static int maxProfit(int[] prices) {

        int buy_price=prices[0];
        int profit=0;

        for(int i=0;i<prices.length;i++)
        {

            //check if found any cheap price

            if(prices[i]<buy_price){
                buy_price=prices[i];
            }else{
                //Update profit if this current_profit is greater than any we've seen.
                int current_profit=prices[i]-buy_price;
                profit=Math.max(current_profit,profit);
            }


        }
        return profit;
    }
}
