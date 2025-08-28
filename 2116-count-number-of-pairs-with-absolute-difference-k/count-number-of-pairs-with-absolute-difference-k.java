class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        for (int num : countMap.keySet()) {
            int partner = num + k;

            if (countMap.containsKey(partner)) {
                result += countMap.get(num) * countMap.get(partner);
            }
        }
        
        
        return result;
    }
}