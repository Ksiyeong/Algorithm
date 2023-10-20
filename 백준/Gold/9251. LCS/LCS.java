import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[] m = bf.readLine().toCharArray();
        char[] n = bf.readLine().toCharArray();

        int[][] dp = new int[m.length + 1][n.length + 1];

        for (int i = 1; i <= m.length; i++) {
            for (int j = 1; j <= n.length; j++) {
                if (m[i - 1] == n[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        System.out.println(dp[m.length][n.length]);
    }
}