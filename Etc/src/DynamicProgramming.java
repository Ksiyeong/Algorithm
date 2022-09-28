public class DynamicProgramming {
    static long[] dp;
    public static void main(String[] args) {
        int n = 100;
        dp  = new long[n+1];

        System.out.println(fibo(n));
//        System.out.println(fibo2(n));
    }

    static long fibo(int x) {
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < x + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[x];
    }

    static long fibo2(int x) {
        if (x==1 || x==2) return 1;
        return fibo2(x - 1) + fibo2(x - 2);
    }
}
