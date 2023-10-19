import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = read();
        int[][] arr = new int[n][2];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = read();
            arr[i][1] = read();
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][1] > arr[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        System.out.print(n - answer - 1);
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}