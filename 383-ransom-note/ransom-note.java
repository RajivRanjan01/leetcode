class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> strHash = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            strHash.put(c, strHash.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!strHash.containsKey(c) || strHash.get(c) <= 0) {
                return false;
            }
            strHash.put(c, strHash.get(c) - 1);
        }

        return true;
    }
}