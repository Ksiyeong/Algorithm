package 조건문;

import java.util.Scanner;

public class No6B3_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        m += c;

        while (m >= 60) {
            if (m >= 60) {
                m -= 60;
                h += 1;
                if (h >= 24) {
                    h -= 24;
                }
            }
        }
        System.out.printf("%d %d", h, m);
    }
}
