import java.util.Arrays;

class Solution {
public int solution(int k, int m, int[] scores) {
        int answer = 0;
        Arrays.sort(scores);

        int minScore = k;
        int p = 0;

        for (int i = scores.length - 1; i >= 0; i--) {
            p++;
            minScore = Math.min(minScore, scores[i]);

            if (p == m) {
                answer += p * minScore;
                p = 0;
            }
        }

        return answer;
    }
}