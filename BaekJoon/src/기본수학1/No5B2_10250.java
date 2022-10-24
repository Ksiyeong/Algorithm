package S7기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No5B2_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int H, W, N;

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int f = 1;
            int w = 1;
            int now = 1;
            while (now < N) {
                now++;
                f += 1;
                if (f > H) {
                    w += 1;
                    f = 1;
                }
            }
            bf.write(String.format("%d%02d\n",f,w));
        }
        bf.flush();
    }
}