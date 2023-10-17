import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        road = new int[M][N];
        dp = new int[M][N];
        for (int y = 0; y < M; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < N; x++) {
                road[y][x] = Integer.parseInt(st.nextToken());
                dp[y][x] = -1;
            }
        }

        System.out.println(solution(0, 0));
    }

    static int M;
    static int N;
    static int[][] road;
    static int[][] dp;

    static private int solution(int y, int x) {
        if (y == M - 1 && x == N - 1) {
            return 1;
        }

        if (dp[y][x] != -1) {
            return dp[y][x];
        }

        dp[y][x] = 0;
        // 상, 하, 좌, 우
        for (int[] temp : new int[][]{{y - 1, x}, {y + 1, x}, {y, x - 1}, {y, x + 1}}) {
            int dy = temp[0];
            int dx = temp[1];

            // 범위 제한
            if (0 <= dy && dy < M && 0 <= dx && dx < N) {
                // 경사도 검사
                if (road[y][x] > road[dy][dx]) {
                    dp[y][x] += solution(dy, dx);
                }
            }
        }

        return dp[y][x];
    }
}