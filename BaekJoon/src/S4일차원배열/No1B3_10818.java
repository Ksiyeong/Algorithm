package S4일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class No1B3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.printf("%d %d", arr[0], arr[n - 1]);
    }
}
