class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        int[] arr = new int[max+1];
        for(int i=0;i<n;i++) {
            arr[nums[i]]++;
        }
        int maxFreq = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(maxFreq<arr[i]) {
                maxFreq = arr[i];
                count = 1;
            } else if (maxFreq == arr[i]) {
                Math.max(maxFreq,++count);
                //count++;
            }

        }
        return count*maxFreq;
        /*Map<Integer, Integer> countMap = new HashMap<>();
        int initialCount = 1;
        int maxCount = 0;
        int ret = 0;
        for(int i=0;i<nums.length;i++) {
             if (countMap.containsKey(nums[i])) {
                int count = countMap.get(nums[i]);
                count++;
                countMap.put(nums[i], count);
                if (maxCount<count) {
                    maxCount = count;
                }
             } else {
                countMap.put(nums[i], initialCount);
             }
             
        }
        if (maxCount == 0) {
            maxCount = 1;
        }
        for(Integer i : countMap.keySet()) {
            if (maxCount == countMap.get(i)) {
                ret += maxCount;
            }
        }
        return ret;
    }*/
    }
}