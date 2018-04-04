/*
Best Time to Buy and Sell Stock II

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/



class Solution {
    // 1 0 0 1 
    // 1,2,4
    // 2 1 4
    public int maxProfit(int[] prices) {
        // pos of the lower price
        int j = 0;
        int profit = 0;
        
        for (int i = 1; i< prices.length ; i++ ){
            // Good timing to sell!
            // Although it said we can't buy and sell at the same day,
            // we can treat the growing ratio as continues and pretend we buy/sell at one day
            if (prices[i] > prices[j]){
                profit += (prices[i]-prices[j]);
            } 
            // we found a lower price 
            // Either this price is smaller than yesterday, or we pretend we already sell it
            // cause above statement is true , we move the lower price pointer to the new postion.
            j = i;
            
        }
        return profit;
    
    }
}