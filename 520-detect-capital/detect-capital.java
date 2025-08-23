class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upperCount++;
            }
        }

        if (upperCount == word.length()) {
            return true;
        }
        else if (upperCount == 0){
            return true;
        }

        if (upperCount == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            return true;
        }

        return false;
    }
}