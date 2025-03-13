class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum =0, total =0, ans = 0;
        for(int i = 0; i<gas.length;i++){
            sum+= gas[i]-cost[i];
            if(sum<0){
                total += sum;
               sum = 0;
                ans = i+1;
            }
        }
        total += sum;
        if(total>=0){
            return ans;

        }
        else{
            return -1;
        }
    }
}