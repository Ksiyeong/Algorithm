package S2조건문;

import java.util.Scanner;

public class No5B3_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - 45;

        if (m < 0) {
            m += 60;
            h -= 1;
            if (h < 0) {
                h = 23;
            }
        }

        System.out.printf("%d %d", h, m);
    }
}
