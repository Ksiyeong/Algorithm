package S9정렬;

import java.util.Arrays;
import java.util.Scanner;

public class No4B2_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[] arr = Arrays.asList(
                        sc.nextLine().split(" ")
                ).stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(arr[N - k]);
    }
}
