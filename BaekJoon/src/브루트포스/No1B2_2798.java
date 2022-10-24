package S11브루트포스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No1B2_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(force(arr, M));
    }

    static Integer force(Integer[] arr, int M) {
        ArrayList<Integer> sumList = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    result = arr[i] + arr[j] + arr[k];
                    if (result <= M) {
                        if (result == M) {
                            return result;
                        } else {
                            sumList.add(result);
                        }
                    }
                }
            }
        }

        return sumList.stream().mapToInt(x -> x).max().orElseThrow();
    }
}
