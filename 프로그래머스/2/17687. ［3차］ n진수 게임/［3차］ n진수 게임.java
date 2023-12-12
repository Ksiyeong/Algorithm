class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder(t);

        int num = 0;
        int order = 1;
        while (true) {
            for (char c : Integer.toString(num++, n).toCharArray()) {
                if (order == p) {
                    if (answer.append(c).length() == t) {
                        return answer.toString().toUpperCase();
                    }
                }
                if (++order > m) {
                    order = 1;
                }
            }
        }
    }
}