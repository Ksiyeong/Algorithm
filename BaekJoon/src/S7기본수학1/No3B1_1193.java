package S7기본수학1;

import java.util.Scanner;

public class No3B1_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int limit = 1;
        int size = 1;

        while (limit < N) {
            size++;
            limit += size;
        }

        int n;
        int d;

        if (size % 2 == 0) {
            n = size;
            d = 1;
            for (int i = 0; i < limit - N; i++) {
                n -= 1;
                d += 1;
            }
        } else {
            n = 1;
            d = size;
            for (int i = 0; i < limit - N; i++) {
                n += 1;
                d -= 1;
            }
        }
        System.out.println(n + "/" + d);
    }
}