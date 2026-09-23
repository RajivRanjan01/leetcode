class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for(int i = 0 ; i<accounts.length; i++){
            int current_wealth = 0;
            for(int j = 0 ; j<accounts[i].length; j++){
                current_wealth = current_wealth + accounts[i][j];
            }
            if(current_wealth>max_wealth){
                max_wealth = current_wealth;
            }
        }
        return max_wealth;
    }
}