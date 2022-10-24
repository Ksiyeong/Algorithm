package S10재귀;

import java.util.Scanner;

public class No2B2_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n==0) return 0;
        else if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
