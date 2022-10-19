package S10재귀;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class No5G5_2447 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();

        int[][] resultArr = star(N);
        for (int[] arr : resultArr) {
            String result = Arrays.toString(arr)
                    .replaceAll("\\D", "")
                    .replaceAll("1", " ")
                    .replaceAll("0", "*");

            bf.write(result + "\n");
        }

        bf.flush();
    }

    /**채워야할 수 만큼 공백으로 채운다
     * 나머지는 출력할 때 null값을 *로 바꿔 출력해준다 ? */
    static int[][] star(int N) {
        int[][] starArr = new int[N][N];

        for (int i = N/3; i < N/3*2; i++) {
            for (int j = N/3; j < N/3*2; j++) {
                starArr[i][j] = 1;
            }
        }


        return starArr;
    }
}
/**
 *
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
 *
 * */