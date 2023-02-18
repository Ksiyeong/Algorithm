import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[i] = i;
            }
        }
        return Arrays.stream(answer)
                .filter(i -> i != 0)
                .toArray();
    }
}