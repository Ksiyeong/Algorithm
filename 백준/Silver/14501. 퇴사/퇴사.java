import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        schedule = new int[n][2];
        dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            String[] split = bf.readLine().split(" ");
            schedule[i][0] = Integer.parseInt(split[0]);
            schedule[i][1] = Integer.parseInt(split[1]);
        }
        System.out.println(recursive(0));
    }

    static int n;
    static int[][] schedule;
    static int[] dp;

    static private int recursive(int index) {
        if (index == n) {
            return 0;
        }
        if (index > n) {
            return Integer.MIN_VALUE;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        dp[index] = Math.max(
                recursive(index + schedule[index][0]) + schedule[index][1],
                recursive(index + 1)
        );

        return dp[index];
    }
}