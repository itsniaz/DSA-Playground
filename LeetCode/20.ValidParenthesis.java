import java.util.*;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentBracket = s.charAt(i);
            char topValue = bracketStack.isEmpty() ? '0' : bracketStack.peek();

            if (brackets.getOrDefault(topValue,'0') == currentBracket) {
                bracketStack.pop();
            } else {
                bracketStack.push(currentBracket);
            }
        }

        return bracketStack.isEmpty();
    }
}
