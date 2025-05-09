class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int low = 0;
        int high = 0;

        while (high < nums.length) {
            currentSum += nums[high];
            high++;

            while (currentSum >= target) {
                int currentWindowSize = high - low; // Calculate the current window size
                minLenWindow = Math.min(minLenWindow, currentWindowSize); // Update minLenWindow
                currentSum -= nums[low]; // Shrink the window from the left
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}