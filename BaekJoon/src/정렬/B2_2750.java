package 정렬;

import java.util.Scanner;

public class B2_2750 { // O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int temp;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (i + 1 < N && arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
