package S6문자열;

import java.util.Scanner;

public class No4B2_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] arr = sc.nextLine().split(" ");
            for (String s : arr[1].split("")) {
                for (int j = 0; j < Integer.parseInt(arr[0]); j++) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}