package S6문자열;

import java.util.Scanner;

public class No2B4_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int total = 0;
        String num = sc.nextLine();



        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(total);
    }
}
