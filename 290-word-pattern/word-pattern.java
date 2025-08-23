import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> cMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (cMap.containsKey(c)) {
                if (!cMap.get(c).equals(w)) {
                    return false;
                }
            } 
            else if (sMap.containsKey(w)) {
                return false; 
            }
            else {
                cMap.put(c, w);
                sMap.put(w, c);
            }
        }

        return true;
    }
}