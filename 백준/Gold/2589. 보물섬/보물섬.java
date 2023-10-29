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

    private static class Distance {
        int y;
        int x;
        int distance;

        private Distance(int y, int x, int distance) {
            this.y = y;
            this.x = x;
            this.distance = distance;
        }
    }

    private static int solution(int y, int x) {
        int answer = 0;
        if (map[y][x]) {
            boolean[][] visited = new boolean[Y][X]; // 방문 여부

            // BFS
            Queue<Distance> q = new LinkedList<>();
            q.offer(new Distance(y, x, 0));
            visited[y][x] = true;
            while (!q.isEmpty()) {
                Distance poll = q.poll();
                for (int[] direction : directions) {
                    int dy = poll.y + direction[0];
                    int dx = poll.x + direction[1];
                    if (0 <= dy && dy < Y && 0 <= dx && dx < X) { // 범위 확인
                        if (map[dy][dx] && !visited[dy][dx]) { // 길 && 방문 여부
                            visited[dy][dx] = true; // 방문 표시
                            answer = Math.max(answer, poll.distance + 1); // 최장 거리 최신화
                            q.offer(new Distance(dy, dx, poll.distance + 1)); // 다음 출발지 표시
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