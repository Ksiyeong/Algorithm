package 일차원배열;

import java.util.Scanner;

public class B3_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int biggest = -1;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > biggest) {
                biggest = arr[i];
                index = i + 1;
            }
        }

        System.out.println(biggest);
        System.out.println(index);
    }
}
