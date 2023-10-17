public class Main {
    public static void main(String[] args) throws Exception {
        M = read();
        N = read();

        road = new int[M][N];
        dp = new int[M][N];

        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                road[y][x] = read();
                dp[y][x] = -1;
            }
        }

        solution(0, 0);
        System.out.print(dp[0][0]);
    }

    static int M;
    static int N;
    static int[][] road;
    static int[][] dp;

    private static void solution(int y, int x) {
        if (y == M - 1 && x == N - 1) {
            dp[y][x] = 1;
            return;
        }

        if (dp[y][x] != -1) {
            return;
        }

        dp[y][x] = 0;
        for (int[] temp : new int[][]{{y - 1, x}, {y + 1, x}, {y, x - 1}, {y, x + 1}}) {
            int dy = temp[0];
            int dx = temp[1];

            if (0 <= dy && dy < M && 0 <= dx && dx < N) {
                if (road[y][x] > road[dy][dx]) {
                    solution(dy, dx);
                    dp[y][x] += dp[dy][dx];
                }
            }
        }
    }

    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}