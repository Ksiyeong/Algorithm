import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] rgb = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            rgb[i][0] = Integer.parseInt(st.nextToken());
            rgb[i][1] = Integer.parseInt(st.nextToken());
            rgb[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            // RED 0
            rgb[i][0] += min(rgb[i - 1][1], rgb[i - 1][2]);
            // GREEN 1
            rgb[i][1] += min(rgb[i - 1][0], rgb[i - 1][2]);
            // BLUE 2
            rgb[i][2] += min(rgb[i - 1][0], rgb[i - 1][1]);
        }

        System.out.println(min(min(rgb[N - 1][0], rgb[N - 1][1]), rgb[N - 1][2]));
    }
}