package S6문자열;

import java.util.Scanner;

public class No6B2_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        int result = arr.length;
        for (String s : arr) {
            if (s.equals("")) {
                result -= 1;
            }
        }
        System.out.println(result);
    }
}
