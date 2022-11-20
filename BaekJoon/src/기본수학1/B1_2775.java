package 기본수학1;

import java.io.*;

public class B1_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int k, n;
        for (int i = 0; i < testCase; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bf.write(floor(k, n) + "\n");
        }
        bf.flush();
    }

    static public int floor(int k, int n) {
        // 쪼갤 수 없는 경우
        if (n == 1) return 1; // 1호일 경우 모두 1이다
        if (k == 1) return n * (n + 1) / 2; // 1층의 경우 1부터 n까지의 합이다

        // 쪼갤 수 있는 경우
        return floor(k, n - 1) + floor(k - 1, n);
    }
}