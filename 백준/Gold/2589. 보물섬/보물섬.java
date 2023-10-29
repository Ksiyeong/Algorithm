import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Y = read();
        X = read();
        map = new boolean[Y][X];
        for (int y = 0; y < Y; y++) {
            char[] temp = br.readLine().toCharArray();
            for (int x = 0; x < X; x++) {
                if (temp[x] == 'L') {
                    map[y][x] = true;
                }
            }
        }

        int answer = 0;

        for (int y = 0; y < Y; y++) {
            for (int x = 0; x < X; x++) {
                answer = Math.max(answer, solution(y, x));
            }
        }

        System.out.println(answer);
    }

    static int Y;
    static int X;
    static boolean[][] map;
    static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    private static int solution(int y, int x) {
        int answer = 0;
        if (map[y][x]) {
            boolean[][] visited = new boolean[Y][X]; // 방문 여부
            int[][] dist = new int[Y][X]; // 위치별 거리

            // BFS
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{y, x});
            visited[y][x] = true;
            while (!q.isEmpty()) {
                int[] yx = q.poll();
                for (int[] direction : directions) {
                    int dy = yx[0] + direction[0];
                    int dx = yx[1] + direction[1];
                    if (0 <= dy && dy < Y && 0 <= dx && dx < X) { // 범위 확인
                        if (map[dy][dx] && !visited[dy][dx]) { // 길 && 방문 여부
                            visited[dy][dx] = true; // 방문 표시
                            dist[dy][dx] = dist[yx[0]][yx[1]] + 1; // 거리 표시
                            answer = Math.max(answer, dist[dy][dx]); // 정답 비교
                            q.offer(new int[]{dy, dx}); // 다음 출발지 표시
                        }
                    }
                }
            }
        }
        return answer;
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}