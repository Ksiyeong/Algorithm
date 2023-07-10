import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] fails = new double[N + 2];
        double[] arrived = new double[N + 2];
        for (int i = 0; i < stages.length; i++) {
            fails[stages[i]]++;
            for (int j = 1; j <= stages[i]; j++) {
                arrived[j]++;
            }
        }

        double[][] arr = new double[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = (i + 1);
            if (arrived[i + 1] == 0) {
                arr[i][1] = 0;
            } else {
                arr[i][1] = (fails[i + 1] / arrived[i + 1]);
            }
        }
        Arrays.sort(arr, Collections.reverseOrder(Comparator.comparingDouble(a -> a[1])));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) arr[i][0];
        }
        return answer;
    }
}