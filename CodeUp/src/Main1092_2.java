import java.util.Scanner;

public class Main1092_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(least(least(a, b), c));
    }

    static int greatest(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int result;

        if (a % b == 0) {
            result = b;
        } else {
            int r = a % b;
            result = greatest(b, r);
        }
        return result;
    }

    static int least(int a, int b) {
        return a * b / greatest(a, b);
    }
}

