class Solution {
    public int[][] merge(int[][] intervals) {
        int max = 0; // Find the maximum start value among all intervals
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }

        int start, end;
        // Create a mapping array with length equal to the maximum start value + 1
        // mp[i] will store the farthest end+1 for a given start i
        int[] mp = new int[max + 1];

        for (int i = 0; i < intervals.length; i++) {
            start = intervals[i][0];
            end = intervals[i][1];
            // If multiple intervals start at the same value, keep the farthest end+1
            // Using end + 1 helps with simplifying the merging logic later
            mp[start] = Math.max(end + 1, mp[start]);
        }

        int idx = 0; // Index to track how many merged intervals we've added
        start = -1;  // Start of current merging interval
        end = -1;    // End of current merging interval

        // Traverse through the mp array (sorted by start implicitly)
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (start == -1) start = i; // Found a new interval
                // Extend the current end to include this new interval if needed
                end = Math.max(mp[i] - 1, end); // mp[i] was stored as end+1, so subtract 1
            }

            // If current index i reaches the current interval's end, finalize this interval
            if (end == i) {
                intervals[idx++] = new int[] { start, end }; // Save the merged interval
                start = -1; // Reset for next potential interval
                end = -1;
            }
        }

        // If there's still a remaining interval to add after loop ends
        if (start != -1) {
            intervals[idx++] = new int[] { start, end };
        }

        // If the number of intervals didn't change, just return the original array
        if (intervals.length == idx) {
            return intervals;
        }

        // Otherwise, return the trimmed result with only the merged intervals
        int[][] res = new int[idx][];
        for (int i = 0; i < idx; i++) {
            res[i] = intervals[i];
        }

        return res;
    }
}