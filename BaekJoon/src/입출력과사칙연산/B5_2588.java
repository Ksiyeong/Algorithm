package 입출력과사칙연산;

import java.util.Scanner;

public class B5_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] b = sc.next().split("");

        int b1 = Integer.parseInt(b[2]);
        int b10 = Integer.parseInt(b[1]);
        int b100 = Integer.parseInt(b[0]);

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * (b1 + b10 * 10 + b100 * 100));

    }
}
