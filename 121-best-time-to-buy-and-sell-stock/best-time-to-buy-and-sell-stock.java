class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <=1){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i =0; i<prices.length; i++){
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit ,currentProfit);
            minPrice =Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}