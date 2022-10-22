package S10재귀;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class No5G5_2447 {
    static int[][] starArr;
    static int N;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        N = sc.nextInt();
        starArr = new int[N][N];
        star(N);

        for (int[] arr : starArr) {
            String result = Arrays.toString(arr)
                    .replaceAll("\\D", "")
                    .replaceAll("1", " ")
                    .replaceAll("0", "*");

            bf.write(result + "\n");
        }
        bf.flush();
    }

    static void star(int num) {
        // 더 이상 쪼갤 수 없는 경우
        if (num == 1) return;

        // 별을 찍을 갯수, num/3이 많이 나와서 n으로 통합
        int n = num / 3;

        for (int i = n; i < N; i += num) { // i 세로 방향의 별찍기 시작점

            for (int j = n; j < N; j += num) { // j 가로 방향의 별찍기 시작점

                for (int l = 0; l < n; l++) { // 세로 방향으로 찍을 별의 좌표 보정

                    for (int k = 0; k < n; k++) { // 가로 방향으로 찍을 별의 좌표 보정

                        starArr[i + l][j + k] = 1;

                    }
                }
            }
        }

        star(n);

    }
}