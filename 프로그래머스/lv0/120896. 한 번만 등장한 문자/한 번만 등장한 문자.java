class Solution {
    public String solution(String s) {
        String answer = "";

        for (char i = 97; i <= 122; i++) {

            int count = s.length() - s.replaceAll(i + "", "").length();

            if (count == 1) {
                answer += i;
            }

        }

        return answer;
    }
}