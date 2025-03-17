class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length/2;
        Map <Integer,Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        for(int frequency : frequencyMap.values()){
            if(frequency%2 !=0){
                return false;
            }
        }
        return true;
    }
}