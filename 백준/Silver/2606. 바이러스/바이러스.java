import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        n = read();
        m = read();
        virus = new boolean[n + 1];
        network = new List[n + 1];
        for (int i = 0; i < m; i++) {
            int a = read();
            int b = read();
            if (network[a] == null) {
                network[a] = new ArrayList<>();
            }
            if (network[b] == null) {
                network[b] = new ArrayList<>();
            }
            network[a].add(b);
            network[b].add(a);
        }

        solution(1);
        System.out.println(answer);
    }

    static int n, m;
    static int answer = -1;
    static boolean[] virus;
    static List<Integer>[] network;

    private static void solution(int idx) {
        if (!virus[idx]) {
            virus[idx] = true;
            answer += 1;
            if (network[idx] != null) {
                for (Integer i : network[idx]) {
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