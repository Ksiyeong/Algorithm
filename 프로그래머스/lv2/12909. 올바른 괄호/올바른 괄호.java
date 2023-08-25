class Solution {
    boolean solution(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open < close) {
                return false;
            }
        }

        return open == close ? true : false;
    }
}