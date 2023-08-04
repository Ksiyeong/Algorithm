import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, Comparator.comparingInt(a -> a[1]));
        int[] target = targets[0];
        for (int i = 1; i < targets.length; i++) {
            if (target[1] > targets[i][0]) {
                continue;
            } else {
                answer++;
                target = targets[i];
            }
        }

        return answer;
    }
}