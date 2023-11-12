import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 == 1) {
            return 0;
        }
        
        int answer = 0;

        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            if (check(list)) {
                answer += 1;
            }
            list.add(list.remove(0));
        }
        
        return answer;
    }

    public boolean check(List<Character> s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.size(); i++) {
            char c = s.get(i);

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