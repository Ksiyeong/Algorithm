import java.util.Scanner;

public class Main1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            list[i] = sc.nextInt();
        }

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
