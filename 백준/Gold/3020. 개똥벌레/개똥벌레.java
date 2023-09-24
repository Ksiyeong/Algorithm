import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();

        int[] arr = new int[H];
        for (int i = 0; i < N; i += 2) {
            arr[0] += 1;
            arr[sc.nextInt()] -= 1;
            arr[H - sc.nextInt()] += 1;
        }

        for (int i = 1; i < H; i++) {
            arr[i] += arr[i - 1];
        }

        int minimum = Integer.MAX_VALUE;
        int count = 0;
        for (int num : arr) {
            if (num < minimum) {
                minimum = num;
                count = 1;
            } else if (num == minimum) {
                count++;
            }
        }

        System.out.println(minimum + " " + count);
    }
}
