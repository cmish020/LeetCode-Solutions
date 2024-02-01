class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
       
        char[] openBrackets = {'(', '{', '['};
        char[] closeBrackets = {')', '}', ']'};
       
        java.util.Map<Character, Character> bracketMap = new java.util.HashMap<>();
        for (int i = 0; i < openBrackets.length; i++) {
            bracketMap.put(closeBrackets[i], openBrackets[i]);
        }

        for (char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) {
               
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}