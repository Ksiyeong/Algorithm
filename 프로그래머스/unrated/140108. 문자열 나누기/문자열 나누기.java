class Solution {
    public int solution(String s) {
        int answer = 0;

        char x = '-';
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {

            if (countX == 0) {
                x = s.charAt(i);
                answer++;
                countX++;
                continue;
            }

            if (x == s.charAt(i)) {
                countX++;
            } else {
                countY++;
            }

            if (countX == countY) {
                countX = 0;
                countY = 0;
            }
        }

        return answer;
    }
}