import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 == 1) {
            return 0;
        }

        int answer = 0;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (check(sb.toString())) {
                answer += 1;
            }
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }

        return answer;
    }

    private boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char peek = stack.peek();
                if ((peek == '(' && c == ')') ||
                    (peek == '[' && c == ']') ||
                    (peek == '{' && c == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}