package S3반복문;

import java.io.*;
import java.util.StringTokenizer;

public class No6B5_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(input.nextToken()) + Integer.parseInt(input.nextToken());
            bw.write("Case #" + i + ": " + a + "\n");
        }
        bw.flush();
    }
}
