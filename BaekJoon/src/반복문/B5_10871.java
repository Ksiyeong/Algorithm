package 반복문;

import java.util.Scanner;

public class B5_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.print(x > a ? a + " " : "");
        }
    }
}
