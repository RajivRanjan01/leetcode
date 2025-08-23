class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isAllUppercase = word.equals(word.toUpperCase());
        boolean isCapitalized = word.matches("[A-Z][a-z]*");
        boolean isAllLowercase = word.equals(word.toLowerCase());

        if(isAllUppercase || isCapitalized || isAllLowercase)
            return true;
        else 
            return false;
    }
}