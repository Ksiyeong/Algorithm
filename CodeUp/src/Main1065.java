import java.util.Scanner;

public class Main1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(a % 2 == 0 ? a + "\n" : "");
        System.out.print(b % 2 == 0 ? b + "\n" : "");
        System.out.print(c % 2 == 0 ? c : "");

    }
}
