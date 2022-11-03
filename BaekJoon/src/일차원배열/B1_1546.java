package 일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class B1_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] result = new double[n];

        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        Arrays.sort(result);

        double newResult = 0;

        for (double i : result) {
            newResult += i / result[n - 1] * 100;
        }

        System.out.println(newResult / n);
    }
}
