public class Main {
    public static void main(String[] args) throws Exception {
        n = read();
        m = read();
        virus = new boolean[n + 1];
        network = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = read();
            int b = read();
            network[a][b] = true;
            network[b][a] = true;
        }

        solution(1);
        System.out.println(answer);
    }

    static int n, m;
    static int answer = -1;
    static boolean[] virus;
    static boolean[][] network;

    private static void solution(int idx) {
        if (!virus[idx]) {
            virus[idx] = true;
            answer += 1;
            for (int i = 1; i <= n; i++) {
                if (network[idx][i]) {
                    solution(i);
                }
            }
        }
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}