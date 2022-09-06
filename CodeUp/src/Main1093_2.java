import java.util.Scanner;

public class Main1093_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[23];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt() - 1;
            list[num] += 1;
        }

        for (int i : list) {
            System.out.printf("%d ", i);
        }
    }
}
