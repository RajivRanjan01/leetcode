class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_price_so_far = prices[0]; 

        for (int i = 0; i < prices.length; i++) {
            
            min_price_so_far = Math.min(min_price_so_far, prices[i]);
            int potential_profit = prices[i] - min_price_so_far;
            max_profit = Math.max(max_profit, potential_profit);
        }

        return max_profit;
    }
}