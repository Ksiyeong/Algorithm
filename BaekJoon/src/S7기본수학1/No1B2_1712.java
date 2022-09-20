package S7기본수학1;

import java.util.Scanner;

public class No1B2_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) {
            System.out.println(-1);
        } else {
            long BEP = 0;
            while (A / (C - B) >= BEP) {
                BEP++;
            }
            System.out.print(BEP);
        }
    }
}