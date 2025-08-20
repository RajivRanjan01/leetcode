class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] alphabet = new int[26];
        for (char a : ransomNote.toCharArray()) {
            int i = magazine.indexOf(a, alphabet[a - 'a']);
            if (i == -1) {
                return false;
            }
            alphabet[a - 'a'] = i + 1;
        }
        return true;
    }
}