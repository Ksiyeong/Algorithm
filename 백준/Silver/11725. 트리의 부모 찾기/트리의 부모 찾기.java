import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = read();
        List<Integer>[] tree = new List[N + 1];
        for (int i = 0; i < N - 1; i++) {
            int a = read();
            int b = read();

            if (tree[a] == null) {
                tree[a] = new ArrayList<>();
            }
            if (tree[b] == null) {
                tree[b] = new ArrayList<>();
            }

            tree[a].add(b);
            tree[b].add(a);
        }

        int[] parents = new int[N + 1];
        parents[1] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (Integer next : tree[node]) {
                if (parents[next] == 0) {
                    parents[next] = node;
                    q.offer(next);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i < N + 1; i++) {
            bw.write(parents[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}