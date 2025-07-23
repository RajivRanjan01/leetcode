class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            seenNumbers.add(num);
        }
        for( int i = 0; i<=n; i++){
                if(!seenNumbers.contains(i)){
                    return i;
                }
        }
        return -1;
    }
}