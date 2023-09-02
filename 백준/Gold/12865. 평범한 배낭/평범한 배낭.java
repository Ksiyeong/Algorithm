import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        k = Integer.parseInt(split[1]);
        dp = new int[n][k + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        items = new int[n][2];
        for (int i = 0; i < n; i++) {
            split = bf.readLine().split(" ");
            items[i][0] = Integer.parseInt(split[0]);
            items[i][1] = Integer.parseInt(split[1]);
        }

        System.out.println(recursive(0, 0));
    }

    static int n;
    private static int k;
    static int[][] items;
    static int[][] dp;

    static private int recursive(int index, int weight) {
        if (weight > k) {
            return Integer.MIN_VALUE;
        }
        if (index == n) {
            return 0;
        }
        if (dp[index][weight] != -1) {
            return dp[index][weight];
        }
        dp[index][weight] = Math.max(
                recursive(index + 1, weight + items[index][0]) + items[index][1],
                recursive(index + 1, weight)
        );

        return dp[index][weight];
    }
}