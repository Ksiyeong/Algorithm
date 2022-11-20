package 기본수학1;

import java.util.Scanner;

public class B2_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int distance = 1;
        int now = 1;
        int limit = 1;

        for (int i = 0; i < N; i++) {
            if (now > limit) {
                limit += distance * 6;
                distance++;
            }
            now++;
        }
        System.out.println(distance);
    }
}