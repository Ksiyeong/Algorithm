package S6문자열;

import java.util.Arrays;
import java.util.Scanner;

public class No7B2_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        int[] newArr = new int[2];

        for (int i = 0; i < 2; i++) {
            String num = "";
            for (int j = 2; j >= 0; j--) {
                num += arr[i].split("")[j];
            }
            newArr[i] = Integer.parseInt(num);
        }

        System.out.println(Arrays.stream(newArr).max().getAsInt());
    }
}
