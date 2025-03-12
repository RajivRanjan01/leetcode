class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int h = n; h>=0;h--){
            int count = 0;
            for(int i = 0; i<n; i++){
                if(citations[i]>=h){
                    count++;
                }
            }
            if(count>=h){return h;}
        }
         return 0;
    }
   


}