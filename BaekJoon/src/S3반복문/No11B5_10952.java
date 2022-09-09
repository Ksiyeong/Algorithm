package S3반복문;

import java.util.Scanner;

public class No11B5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print((a + b != 0) ? a + b + "\n" : "");
        } while (a + b != 0);

    }
}
