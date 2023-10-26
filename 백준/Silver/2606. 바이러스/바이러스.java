import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        n = read();
        m = read();
        virus = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int a = read();
            int b = read();

            List<Integer> aOrDefault = network.getOrDefault(a, new ArrayList<>());
            aOrDefault.add(b);
            network.put(a, aOrDefault);

            List<Integer> bOrDefault = network.getOrDefault(b, new ArrayList<>());
            bOrDefault.add(a);
            network.put(b, bOrDefault);
        }


        solution(1);

        int answer = 0;
        for (boolean v : virus) {
            if (v) {
                answer += 1;
            }
        }
        System.out.println(answer - 1);
    }

    static int n, m;
    static boolean[] virus;
    static Map<Integer, List<Integer>> network = new HashMap<>();

    private static void solution(int key) {
        if (virus[key]) {
            return;
        }
        virus[key] = true;

        if (network.get(key) != null) {
            for (Integer computer : network.get(key)) {
                solution(computer);
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