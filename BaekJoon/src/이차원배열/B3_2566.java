package 이차원배열;

import java.io.*;
import java.util.Arrays;

public class B3_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        int[] biggest = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            biggest[i] = Arrays.stream(arr[i])
                    .max()
                    .getAsInt();
        }

        int maxNum = Arrays.stream(biggest).max().getAsInt();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == maxNum) {
                    bw.write(maxNum + "\n" + (i + 1) + " " + (j + 1) + "\n");
                }
            }
        }
        bw.flush();
    }
}
