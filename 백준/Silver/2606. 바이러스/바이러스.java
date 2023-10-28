import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = read();
        int m = read();
        boolean[] virus = new boolean[n + 1];
        Map<Integer, List<Integer>> network = new HashMap<>();
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

        int answer = -1;
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        while (!q.isEmpty()) {
            Integer computer = q.pollFirst();
            if (!virus[computer]) {
                virus[computer] = true;
                answer += 1;
            }

            if (network.get(computer) != null) {
                for (Integer nextComputer : network.get(computer)) {
                    if (!virus[nextComputer]) {
                        q.addLast(nextComputer);
                    }
                }
            }
        }

        System.out.println(answer);
    }

    // 읽기
    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}