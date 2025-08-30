class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> substringCounts = new HashMap<>();
        
        int[] charCounts = new int[26];
        int uniqueChars = 0;
        int left = 0;
        int maxOccurrences = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charCounts[currentChar - 'a'] == 0) {
                uniqueChars++;
            }
            charCounts[currentChar - 'a']++;

            while (right - left + 1 > minSize) {
                char leftChar = s.charAt(left);
                charCounts[leftChar - 'a']--;
                if (charCounts[leftChar - 'a'] == 0) {
                    uniqueChars--;
                }
                left++;
            }
            
            if (right - left + 1 == minSize) {
                if (uniqueChars <= maxLetters) {
                    String sub = s.substring(left, right + 1);
                    substringCounts.put(sub, substringCounts.getOrDefault(sub, 0) + 1);
                }
            }
        }

        for (int count : substringCounts.values()) {
            maxOccurrences = Math.max(maxOccurrences, count);
        }
        
        return maxOccurrences;
    }
}