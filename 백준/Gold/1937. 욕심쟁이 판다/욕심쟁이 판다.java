import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        forest = new int[N][N];
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                forest[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer = Math.max(answer, solution(i, j));
            }
        }

        System.out.println(answer + 1);
    }

    static int N;
    static int[][] forest;
    static int[][] dp;
    static int answer = 0;

    static private int solution(int y, int x) {
        if (dp[y][x] != 0) {
            return dp[y][x];
        }

        // 상, 하, 좌, 우
        for (int[] temp : new int[][]{{y - 1, x}, {y + 1, x}, {y, x - 1}, {y, x + 1}}) {
            int dy = temp[0];
            int dx = temp[1];

            // 범위 제한
            if (0 <= dy && dy < N && 0 <= dx && dx < N) {
                // 대나무 양 검사
                if (forest[y][x] < forest[dy][dx]) {
                    dp[y][x] = Math.max(dp[y][x], solution(dy, dx) + 1);
                }
            }
        }

        return dp[y][x];
    }
}