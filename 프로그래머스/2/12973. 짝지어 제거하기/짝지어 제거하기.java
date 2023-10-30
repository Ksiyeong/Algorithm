import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 == 1) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}