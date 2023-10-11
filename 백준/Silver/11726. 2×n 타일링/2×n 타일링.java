import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }


    static private int solution(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        if (n > 1) {
            dp[1] = 2;
        }

        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        return dp[n - 1];
    }
}