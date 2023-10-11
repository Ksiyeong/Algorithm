import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        int[][] items = new int[n][2];
        for (int i = 0; i < n; i++) {
            split = bf.readLine().split(" ");
            items[i][0] = Integer.parseInt(split[0]);
            items[i][1] = Integer.parseInt(split[1]);
        }

        System.out.println(solution(n, k, items));
    }


    static private int solution(int n, int k, int[][] items) {
        int[][] dp = new int[n + 1][k + 1];

        for (int index = 1; index <= n; index++) {
            for (int weight = 1; weight <= k; weight++) {

                if (weight < items[index - 1][0]) {
                    dp[index][weight] = dp[index - 1][weight];
                } else {
                    dp[index][weight] = Math.max(
                            dp[index - 1][weight],
                            dp[index - 1][weight - items[index - 1][0]] + items[index - 1][1]
                    );
                }

            }
        }

        return dp[n][k];
    }
}