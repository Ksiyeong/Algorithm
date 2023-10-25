import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(m, trees));
    }

    private static int solution(int target, int[] trees) {
        int s = 1;
        int e = getMaxValue(trees);
        while (s <= e) {
            int mid = (s + e) / 2;
            long wood = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    wood += tree - mid;
                }
            }

            if (wood >= target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i : arr) {
            maxValue = Math.max(maxValue, i);
        }
        return maxValue;
    }
}