class Solution {
    public String sortVowels(String s) {
        
        List<Character> vowelsList = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (isVowel(c)) {
                vowelsList.add(c);
            }
        }
        
        Collections.sort(vowelsList);
        
        int vowelIndex = 0; 

        for (int i = 0; i < charArray.length; i++) {
            if (isVowel(charArray[i])) {
                charArray[i] = vowelsList.get(vowelIndex);
                vowelIndex++; 
            }
        }
        
        return new String(charArray);
    }

    
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}