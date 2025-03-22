class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int l = 0;
        int r = cleanedString.length()-1;
        while(l<r){
            if(cleanedString.charAt(l)!= cleanedString.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}