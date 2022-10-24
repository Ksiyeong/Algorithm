package S11브루트포스;

import java.io.*;
import java.util.Arrays;

public class No3S5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] hw;
        int[] height = new int[N];
        int[] weight = new int[N];
        int[] ranking = new int[N];

        for (int i = 0; i < N; i++) {
            hw = br.readLine().split(" ");
            height[i] = Integer.parseInt(hw[0]);
            weight[i] = Integer.parseInt(hw[1]);
            ranking[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (height[i] < height[j] && weight[i] < weight[j]) {
                    ranking[i]++;
                }
            }
        }


        bw.write(Arrays.toString(ranking).replaceAll("\\]|\\[|,", ""));
        bw.flush();
    }
}
