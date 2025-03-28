class Solution {
    public boolean isSubsequence(String s, String t) {
          int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move to the next character in s if a match is found
            }
            j++; // Always move to the next character in t
        }

        // If i has reached the end of s, it means all characters of s were found in t
        return i == s.length();
    }
}