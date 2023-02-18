import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            String s = str
                    .replaceAll("aya", "1")
                    .replaceAll("ye", "1")
                    .replaceAll("woo", "1")
                    .replaceAll("ma", "1");

            if (s.split("1").length == 0) {
                answer++;
            }
        }

        return answer;
    }
}