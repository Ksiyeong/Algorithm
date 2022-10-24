package S5함수;

import java.util.Scanner;

public class No3S4_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = (n > 99) ? 99 : n;

        for (int i = 100; i <= n; i++) {
            if (i / 100 - i / 10 % 10 == i / 10 % 10 - i % 10) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}