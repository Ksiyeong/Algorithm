package 정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S5_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        Integer[] result = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(result, Collections.reverseOrder());

        System.out.println(Arrays.toString(result).replaceAll("\\D", ""));
    }
}
