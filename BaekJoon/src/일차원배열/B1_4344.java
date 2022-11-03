package 일차원배열;

import java.util.Scanner;

public class B1_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int[] scores = new int[num];
            int total = 0;

            for (int j = 0; j < num; j++) {
                scores[j] = sc.nextInt();
                total += scores[j];
            }
            double average = (double) total / num;

            int count = 0;
            for (int score : scores) {
                count += (score > average) ? 1 : 0;
            }
            System.out.printf("%.3f%%\n", (float) count / num * 100);
        }
    }
}
