package 조건문;

import java.util.Scanner;

public class No3B5_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }
    }
}
