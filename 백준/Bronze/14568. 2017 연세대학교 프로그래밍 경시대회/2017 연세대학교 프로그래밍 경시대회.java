import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int a = 2; a <= n; a += 2) {
            for (int b = 1; a + b <= n - 1; b++) {
                int c = n - a - b;
                if (c - b >= 2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}