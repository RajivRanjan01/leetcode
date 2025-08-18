class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

         for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                 stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char lastOpen = stack.pop();
                if (c == ')' && lastOpen != '(') {
                    return false;
                }
                if (c == '}' && lastOpen != '{') {
                    return false;
                }
                if (c == ']' && lastOpen != '[') {
                    return false;
                }
            }
    }
    return stack.isEmpty();
}
}