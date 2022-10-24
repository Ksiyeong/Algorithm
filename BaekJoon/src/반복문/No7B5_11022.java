package S3반복문;

import java.io.*;
import java.util.StringTokenizer;

public class No7B5_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(input.nextToken());
            int b = Integer.parseInt(input.nextToken());
            int c = a + b;

            bw.write(String.format("Case #%d: %d + %d = %d\n", i, a, b, c));
        }
        bw.flush();
    }
}
