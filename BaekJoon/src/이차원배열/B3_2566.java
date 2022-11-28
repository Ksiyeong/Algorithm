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

        bw.write(maxNum + "\n");

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.asList(arr[i]).contains(maxNum));

            if (Arrays.stream(arr[i]).anyMatch(num -> num == maxNum)) {
                bw.write(String.format("%d %d\n", i, 인덱스값 찾아야함));
                break;
            }
        }
        bw.flush();
    }
}
