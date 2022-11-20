package 기본수학1;

import java.util.Scanner;

public class B2_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) {
            System.out.println(-1);
        } else {
            long BEP = A / (C - B);
            System.out.print(BEP + 1);
        }
    }
}