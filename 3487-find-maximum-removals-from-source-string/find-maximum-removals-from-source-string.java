class Solution {
    public int maxRemovals(String source, String pattern, int[] targetIndices) {
        int m = source.length();
        int n = pattern.length();
        int[] target = new int[m];
        int[] dp = new int[n + 1];

        for (int i : targetIndices) {
            target[i] += 1;
        }

        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[n] = 0;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= n; j++) {
                dp[j] += target[i];
                if (j < n && source.charAt(i) == pattern.charAt(j)) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
            }
        }

        return dp[0];
    }
}