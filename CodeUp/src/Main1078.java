import java.util.Scanner;

public class Main1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;

        a -= a % 2 != 0 ? 1 : 0;

        for (int i = 2; i <= a; i+=2) result += i;

        System.out.println(result);
    }
}

