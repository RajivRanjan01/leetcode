class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] charCounts = new int[26];

        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Decrement the count for each character in the ransomNote
        for (char c : ransomNote.toCharArray()) {
            // If the count becomes negative, it means we don't have enough characters
            if (charCounts[c - 'a'] == 0) {
                return false;
            }
            charCounts[c - 'a']--;
        }

        return true;
    }
}